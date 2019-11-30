//
// Created by georg on 11/30/2019.
//


#ifndef LAB3_1_THREAD_SAFE_QUEUE_H
#define LAB3_1_THREAD_SAFE_QUEUE_H

#include <queue>
#include <mutex>
#include<condition_variable>
#include <iostream>
#include "Polynomial/Monomial.h"

class ThreadSafeQueue{
private:
    std::queue<Monomial*> q;
    mutable std::mutex mtx;
    std::condition_variable cond_var;
    bool _verbose;
public:
    explicit ThreadSafeQueue(bool verbose): _verbose(verbose){};

    void push(Monomial* data){
        std::unique_lock<std::mutex> lock(mtx);
        if (_verbose)
            std::cout<<"pushing "<<data->getCoefficient()<<" "<<data->getDegree()<<" "<<q.size()<<'\n';
        q.push(data);
        if (_verbose)
            std::cout<<"front "<<q.front()->getCoefficient()<<" "<<q.front()->getDegree()<<'\n';
        lock.unlock();
        // notify consumers that an element has been added,
        // even if the queue is not empty in case multiple consumers wait on an empty queue
        cond_var.notify_all();
        // STUCK IF notify_one!!!
        // if the producer pushes multiple items in short succession on an empty queue,
        // the single notified consumer cannot empty it in time
        // => the queue will remain not empty with all consumers waiting for the conditional variable
        // unique_lock destructor unlocks mutex
    }
    void wait_and_pop(Monomial* data){
        std::unique_lock<std::mutex> lock(mtx);
        // while the queue is empty, unlock the mutex and wait until it is our turn
        // if the queue is not empty, take the element because we hold the lock on the mutex
        cond_var.wait(lock, [this]{return !q.empty(); });
        // if we get notified that an element has been added ot the queue was not empty to begin with, take the element from the queue
        *data = *q.front();
        if (_verbose)
            std::cout<<"popping "<<data->getCoefficient()<<" "<<data->getDegree()<<'\n';
        q.pop();
        if(data->getDegree() == -1){
            //deadlock nu e de aici
            if (_verbose)
                std::cout<<"unlocking"<<'\n';
            lock.unlock();
            if (_verbose)
                std::cout<<"back"<<'\n';
            //at this point the queue should be empty, and all other threads will get stuck in the cond variable and free the mutex
            // so unlocking is ok, the 2 couts should always be back-to-back
            // push the terminating monome back so that one thread that waits on the empty queue should be notified
            push(data);
        }
        // unique_lock destructor unlocks mutex
    }
};

#endif //LAB3_1_THREAD_SAFE_QUEUE_H