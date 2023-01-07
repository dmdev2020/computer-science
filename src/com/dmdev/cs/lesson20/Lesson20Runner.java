package com.dmdev.cs.lesson20;

public class Lesson20Runner {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
//                break;
                continue;
            }
            System.out.println(i);
        }
    }

    private static void forExample() {
        int i = 0;
        for (; true; ) {
            System.out.println(i);
            i++;
        }
//        while (true) {
//
//        }
//        for (int value = 10; value > 0; value--) {
//            System.out.println(value);
//        }

//        int value = 10;
//        while (value > 0) {
//            System.out.println(value);
//            value--; // value = value - 1; value -= 1;
//        }
    }
}
