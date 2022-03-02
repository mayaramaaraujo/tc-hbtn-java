#!/bin/bash
mkdir build
javac -d .\build com/holbertonschool/matematica/Aritmeticos.java
cd build
jar cvf Matematica.jar .\Aritmeticos.class