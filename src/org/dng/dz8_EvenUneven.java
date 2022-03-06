package org.dng;

import java.util.Scanner;

/**
 Задание 8
 Даны два числа x и y. Программа должна вывести в консоль YES, – если оба числа четные, либо оба числа нечетные;
 иначе программа ничего не выводит.
 */
public class dz8_EvenUneven {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("input couple of integer numbers (x y)");
        try (Scanner sc = new Scanner(System.in)) { //sc.close();
            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
            } else {
                throw new IllegalArgumentException("wrong input...");
            }
            if (sc.hasNextInt()) {
                num2 = sc.nextInt();
            } else {
                throw new IllegalArgumentException("wrong input...");
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        if (((num1 % 2 == 0) && (num2 % 2 == 0)) || ((num1 % 2 != 0) && (num2 % 2 != 0))) {
            System.out.println("YES");
        }

    }
}
