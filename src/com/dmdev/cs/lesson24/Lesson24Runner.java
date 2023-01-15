package com.dmdev.cs.lesson24;

public class Lesson24Runner {

    public static void main(String[] args) {
        int[][] values = new int[3][];
        values[0] = new int[7];
        values[0][3] = 97;
        System.out.println(values.length); // 3
        System.out.println(values[1]);
        System.out.println(values[0]);
        System.out.println(values[0].length);
        System.out.println(values[0][1]); // 0
        System.out.println(values[0][3]); // 97

//        int[][] values = new int[3][4];
//        System.out.println(values.length); // 3
//        System.out.println(values[1].length); // 4
//        System.out.println(values[1][3]); // 0
    }

    private static void example1() {
        int[][] values = {
                {-1, 0}, // 0
                null, // 1
                {8, 65, 34, -6}, // 2
                {} // 3
        };
        System.out.println(values.length); // 4
        System.out.println(values[0].length); // 2
        System.out.println(values[0][1]); // 0
        System.out.println(values[2][2]); // 34
        System.out.println(values[1]); // null
    }
}
