package com.pluralsight.calcengine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Please enter the first value: ");
        double value1 = getValue();
        System.out.println("Please enter the second value: ");
        double value2 = getValue();
        System.out.println("Please enter your operator: ");
        char opCode = getOpCode();

        runCalc(value1, value2, opCode);

    }

    public static Double getValue() {
        Scanner scanner = new Scanner(System.in);
        Double value = scanner.nextDouble();
        return value;
    }

    public static double getValue2() {
        Scanner scanner = new Scanner(System.in);
        Double value2 = scanner.nextDouble();
        return value2;
    }

    public static char getOpCode() {
        Scanner scanner = new Scanner(System.in);
        char value = scanner.next().charAt(0);
        return value;
    }

    public static void printResult(double value1, double value2, char opCode, double result) {
        System.out.println(value1 + " " + opCode + " " + value2 + " = " + result);
    }

    public static void runCalc(double value1, double value2, char opCode) {
        double result = 0;

        if (opCode == '/' && value2 == 0) {
            System.out.println("Cannot divide by 0");
        } else if (opCode == '/') {
            result = (value1 / value2);
        } else if (opCode == '+') {
            result = (value1 + value2);
        } else if (opCode == '-') {
            result = (value1 - value2);
        } else if (opCode == '*') {
            result = (value1 * value2);
        } else {
            System.out.println("Incorrect value detected. Aborting.");
        }
        printResult(value1, value2, opCode, result);
    }

}