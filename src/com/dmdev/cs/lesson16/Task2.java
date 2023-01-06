package com.dmdev.cs.lesson16;

/**
 * Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.
 */
public class Task2 {

    public static void main(String[] args) {
        int value = -1233244;
        int reminder = value % 10;
        boolean test = reminder == 3 || reminder == -3;
        if (test) {
            System.out.println("Yes");
        } else {
            System.out.println("No. Reminder: " + reminder);
        }
    }
}
