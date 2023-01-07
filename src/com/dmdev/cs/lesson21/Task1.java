package com.dmdev.cs.lesson21;

/**
 * Написать программу высчитывающую факториал введённого целого числа.
 */
public class Task1 {

    public static void main(String[] args) {
//        5! = 1 * 2 * 3 * 4 * 5 = 120
        int value = 5;
        int result = factorial(value);
        System.out.println(result); // 120
        System.out.println(factorialWhile(value));
    }

    public static int factorialWhile(int value) {
        int result = 1;
        int currentValue = 1;
        while (currentValue <= value) {
            result *= currentValue;
            currentValue++;
        }

        return result;
    }

    public static int factorial(int value) {
        int result = 1;
        for (int currentValue = 1; currentValue <= value; currentValue++) {
            result *= currentValue;
        }
        return result;
    }
}







