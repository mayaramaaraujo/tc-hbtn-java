#!/bin/bash
javac -d com/holbertonschool/main -cp lib/Matematica.jar com/holbertonschool/main/Program.java
java -cp lib/Matematica.jar:. com.holbertonschool.main.Program
