package com.dmdev.cs.lesson22;

public class Lesson22Example {

    public static void main(String[] args) {
        int value = 5; // 120 = 1 * 2 * 3 * 4 * 5 = 5!
        int result = factorial(value);
        System.out.println(result);
    }

    private static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
//        5 * (4 * (3 * (2 * 1)))
        return value * factorial(value - 1);
    }
}
