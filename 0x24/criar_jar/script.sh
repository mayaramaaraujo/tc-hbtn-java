#!/bin/bash
javac com/holbertonschool/matematica/Aritmeticos.java -d ./build
cd build
jar -cvf Matematica.jar com