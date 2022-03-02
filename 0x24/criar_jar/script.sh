#!/bin/bash
javac -d build com/holbertonschool/matematica/Aritmeticos.java
cd build/com/holbertonschool/matematica/
jar cvf  Matematica.jar Aritmeticos.class