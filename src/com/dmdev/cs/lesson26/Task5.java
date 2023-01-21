package com.dmdev.cs.lesson26;

/**
 * Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */
public class Task5 {

    public static void main(String[] args) {
        //              0  1  2  3    4    5   6
        int[] values = {1, 7, 0, 28, -24, 2, 8, -4, 109, 5, -30};
        System.out.println("Sum: " + sum(values)); // 0
        System.out.println("Sum: " + sum2(values)); // 0
    }

    public static int sum(int[] values) {
        int result = 0;
        int minIndex = Task4.getMinIndex(values);
        int maxIndex = Task4.getMaxIndex(values);
//        int startIndex = minIndex < maxIndex ? minIndex : maxIndex;
        int startIndex = Math.min(minIndex, maxIndex);
        int endIndex = Math.max(minIndex, maxIndex);
        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }

        return result;
    }

    public static int sum2(int[] values) {
        int result = 0;
        int startIndex = Task4.getMinIndex(values);
        int endIndex = Task4.getMaxIndex(values);
        if (endIndex < startIndex) {
            int temp = endIndex;
            endIndex = startIndex;
            startIndex = temp;
        }
        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }

        return result;
    }
}





