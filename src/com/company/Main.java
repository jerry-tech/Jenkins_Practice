package com.company;

public class Main {

    public int addNumbers(int firstNumber,int secondsNumber) {
        int total = firstNumber + secondsNumber;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(new Main().addNumbers(2,3));
    }
}
