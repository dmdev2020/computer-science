package com.dmdev.cs.lesson18;

public class Task2 {

    public static void main(String[] args) {
        int value = 5;
        int result = cube(value);
        System.out.println("Cube is: " + result);
    }

    public static int cube(int value) {
        return (value * value * value);
    }
}
