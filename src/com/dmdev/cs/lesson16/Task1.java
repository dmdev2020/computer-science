package com.dmdev.cs.lesson16;

/**
 * Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */
public class Task1 {

    public static void main(String[] args) {
        int month = 10;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
//            3 <= month <= 5
        } else if (3 <= month && month <= 5) {
            System.out.println("Spring");
        } else if (6 <= month && month <= 8) {
            System.out.println("Summer");
        } else if (9 <= month && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Month is invalid: " + month);
        }
    }
}
