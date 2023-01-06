package com.dmdev.cs.lesson16;

/**
 * Имеется целое число. Это число - сумма денег в рублях.
 *    Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").
 */
public class Task3 {

    public static void main(String[] args) {
        int rubles = 1012;
//      1, !11  рубль
//      2, 3, 4, !12-14 рубля
//      0, 5-9, 11-19 рублей
        int reminder10 = rubles % 10;
        int reminder100 = rubles % 100;
        if (reminder10 == 0 || (5 <= reminder10 && reminder10 <= 9) || (11 <= reminder100 && reminder100 <= 19)) {
            System.out.println(rubles + " рублей");
        } else if (2 <= reminder10 && reminder10 <= 4) {
            System.out.println(rubles + " рубля");
        } else if (reminder10 == 1) {
            System.out.println(rubles + " рубль");
        } else {
            System.out.println("Rubles variable is invalid: " + rubles);
        }
    }
}
