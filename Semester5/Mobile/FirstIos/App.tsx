import React, { Component } from 'react';
import Main from './app/components/Main';
import Database from './app/store/database'

const db = new Database()


export default class App extends React.Component{
  
  render(){
    return(
      <Main />
    );
  }
}