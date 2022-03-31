package com.company;

import java.util.Scanner;

public class GetRomeDate {

    //check from one to ten Rome digits
    public boolean containRome(String number) {
        for (RomeDigitsToTen rome : RomeDigitsToTen.values()) {
            if (rome.name().equals(number)) {
                return true;
            }
        }
        return false;
    }

    //getting second Rome number
    public String getRomeSecondNumber(String RomeSecondNumber) throws MyRomeNumberException {
        if (!containRome(RomeSecondNumber)) {
            throw new MyRomeNumberException("Roman number expected from 1 to 10");
        }
        return RomeSecondNumber;
    }

    //calculator for Rome digits
    String calculateRome(String firstNumber, String symbol, String secondNumber) {
        String romeAnswer = null;
        int first = RomeDigits.valueOf(firstNumber).getNumber();
        int second = RomeDigits.valueOf(secondNumber).getNumber();
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
        for (RomeDigits rome : RomeDigits.values()) {
            if (rome.getNumber() == result) {
                return romeAnswer = rome.name();
            }
        }
        return romeAnswer;
    }

}
