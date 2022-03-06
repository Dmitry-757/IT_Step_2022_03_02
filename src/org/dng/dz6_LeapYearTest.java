package org.dng;

import java.util.Scanner;

/**
 Определить количество дней в году, который вводит
 пользователь, и вывести их в консоль. В високосном году –
 366 дней, тогда как в обычном – 365. Високосными годами
 являются все годы, делящиеся нацело на 4, за исключением
 столетий, которые не делятся нацело на 400.
 */
public class dz6_LeapYearTest {
    public static void main(String[] args) {
        int year;
        System.out.println("input year");
        try (Scanner sc = new Scanner(System.in)) { //sc.close();
            if (sc.hasNextInt()) {
                year = sc.nextInt();
            } else {
                throw new IllegalArgumentException("wrong input...");
            }
            if (year <= 0) { //don`t want to work with BC
                throw new IllegalArgumentException("wrong input...");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        if ((year % 4 == 0) && (year % 400 != 0)) {
            System.out.printf("Year %d is leap, number of days is 366", year);
        } else {
            System.out.printf("Year %d is not leap, number of days is 365", year);
        }
    }
}
