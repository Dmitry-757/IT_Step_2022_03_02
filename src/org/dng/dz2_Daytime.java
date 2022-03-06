package org.dng;

import java.util.Scanner;

/**
 * С клавиатуры вводится время (количество часов от 0 до  24) – программа выводит приветствие, соответствующее
 * введенному времени (например, ввели 15 часов – выводится приветствие «Добрый день»).
 */
public class dz2_Daytime {
    public static void main(String[] args) {
        int hour;
        System.out.println("input hour from 0 to 24");
        try (Scanner sc = new Scanner(System.in)) { //sc.close();
            if (sc.hasNextInt()) {
                hour = sc.nextInt();
            } else {
                throw new Exception("wrong input...");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        try {
            switch (hour) {
                case 23, 24, 0, 1, 2, 3, 4, 5 -> System.out.println("good night");
                case 6, 7, 8, 9, 10 -> System.out.println("good morning");
                case 11, 12, 13, 14, 15, 16, 17 -> System.out.println("good day");
                case 18, 19, 20, 21, 22 -> System.out.println("good evening");
                default -> {
                    throw new IllegalArgumentException("number must be between 0 and 24, including 0 and 24");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
