package com.dmdev.cs.lesson21;

/**
 * Написать программу, определяющую, является ли введённое
 *    целое число простым, т.е. делится без остатка только на 1 и само
 *    на себя.
 */
public class Task4 {

    public static void main(String[] args) {
//        1 < value < 21
        int value = 23;
        boolean result = isSimple(value);
        System.out.println(result);
    }

    private static boolean isSimple(int value) {
        for (int currentValue = 2; currentValue < value; currentValue++) {
            if (value % currentValue == 0) {
                return false;
            }
        }
        return true;
    }
}






