package com.company;

import java.util.Scanner;

public class GetDate {

    //check firstNumber for a condition from 1 to ten
    public boolean checkFirstNumber(String firstNumber) {
        return Integer.parseInt(firstNumber) >= 1 && Integer.parseInt(firstNumber) <= 10;
    }

    //check secondNumber for a condition
    public String getSecondNumber(String secondNumber) throws MyNumberExсeption {
        int second = Integer.parseInt(secondNumber);
        if (second < 1 || second > 10) {
            throw new MyNumberExсeption("Incorrect second number!");
        }
        return secondNumber;
    }
        //getting symbol for arabian and Rome
    public String getSymbol(String expression) throws MySymbolException {
        String[] arraySymbol = {"+", "-", "*", "/"};
        String symbol = null;
        for (String ar:arraySymbol) {
            if (expression.contains(ar)){
                symbol = ar;
            }
        }
        return symbol;
    }

    //calculator for arabian digits
    String calculate(String firstNumber, String symbol, String secondNumber) {
        String resultString = null;
        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);
        int result = 0;
        switch (symbol) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
        }
        return resultString = Integer.toString(result);
    }

    //check symbol
    public void checkSymbol(String expression) throws MySymbolException {
        String plus = "+";
        String minus = "-";
        String multiply = "*";
        String devison = "/";

        if (expression.contains(plus) ^ expression.contains(minus) ^ expression.contains(multiply) ^ expression.contains(devison)){
        } else throw new MySymbolException("Incorrect symbol");
    }
}