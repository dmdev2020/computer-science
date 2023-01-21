package com.dmdev.cs.lesson26;

/**
 * Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 *    2-х двумерных массивов.
 */
public class Task3 {

    public static void main(String[] args) {
        int[][] values1 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {7, 8}
        };
        int[][] values2 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {7, 8, 0}
        };
        System.out.println(equals(values1, values2));
    }

    public static boolean equals(int[][] values1, int[][] values2) {
        if (values1.length != values2.length) {
            return false;
        }
        for (int i = 0; i < values1.length; i++) {
            int[] array1 = values1[i];
            int[] array2 = values2[i];
            if (array1.length != array2.length) {
                return false;
            }
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] != array2[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}







