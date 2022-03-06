package org.dng;

import java.util.Scanner;

/**
 * Задание 12
 * Программа запрашивает шестизначное число. После ввода определяет, будет ли являться «счастливым» билет с таким номером (сумма первых трех цифр совпадает с суммой
 * трех последних).
 * Пример входных данных:
 * 423027 - happy
 * 954832 - not happy
 */
public class dz12_HappyNumber {
    public static void main(String[] args) {
        int number, numLenght = 0;
        System.out.println("input number, it must contain an even number of digits");
        try (Scanner sc = new Scanner(System.in)) { //sc.close();
            if (sc.hasNextInt()) {
                number = sc.nextInt();
            } else {
                throw new IllegalArgumentException("wrong input...");
            }
            if (number <= 0) { //don`t want to work with BC
                throw new IllegalArgumentException("wrong input...");
            }
            numLenght = (int) Math.ceil(Math.log10(number));
            if (numLenght % 2 != 0) { //uneven number of digits
                throw new IllegalArgumentException("wrong input. It must contain an even number of digits");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        int firstHalfDigits = 0;
        for (int i = 0; i < (numLenght / 2); i++) {
            firstHalfDigits = firstHalfDigits + (number / (int) Math.pow(10, i)) % 10;
        }
        int secondHalfDigits = 0;
        for (int i = (numLenght / 2); i < numLenght; i++) {
            secondHalfDigits = secondHalfDigits + (number / (int) Math.pow(10, i)) % 10;
        }
        if (firstHalfDigits == secondHalfDigits) {
            System.out.printf("ticket number %d is happy", number);
        } else {
            System.out.printf("ticket number %d does not meet conditions happiness", number);
        }
    }
}
