#include <iostream>
#include "utils/Helper.h"

int main() {
    std::string path1 = R"(C:\Users\georg\Desktop\An3_sem1\PPD\lab1_cpp\num_file_b.txt)";
    std::string path2 = R"(C:\Users\georg\Desktop\An3_sem1\PPD\lab1_cpp\num_file_a.txt)";
    std::string path3 = R"(C:\Users\georg\Desktop\An3_sem1\PPD\Lab1_java\src\num_file_b.txt)";
    std::string path4 = R"(C:\Users\georg\Desktop\An3_sem1\PPD\Lab1_java\src\num_file_a.txt)";
    std::string dtype = "int";
    auto helper = Helper();
    helper.createRandomFile(path3, 1000 , 0, 9);
    helper.createRandomFile(path4, 1000 , 0, 9);

    //std::cout << helper.compareFiles(path1, path2, dtype);
    return 0;
}