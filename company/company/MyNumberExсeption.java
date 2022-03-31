package com.company;

//exception for arabian digits
public class MyNumberExсeption extends Exception {
    MyNumberExсeption(String message){
        super(message);
    }
}

//exception for symbol
class MySymbolException extends Exception{
    MySymbolException(String message){
        super(message);
    }
}

//exception for Rome digits
class MyRomeNumberException extends Exception{
    MyRomeNumberException(String message){
        super(message);
    }
}