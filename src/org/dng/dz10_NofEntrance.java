package org.dng;

import java.util.Scanner;

/**
 Определить номер подъезда девятиэтажного дома, по
 указанному номеру квартиры N. Считать, что на каждом
 этаже находится M квартир. Вывести в консоль номер подъезда.
 */
public class dz10_NofEntrance {
    public static void main(String[] args) {
        int numFlat, amountFlatsOnStage;
        System.out.println("input number of flat and amount flats on each stage");
        try (Scanner sc = new Scanner(System.in)) { //sc.close();
            if (sc.hasNextInt()) {
                numFlat = sc.nextInt();
            } else {
                throw new IllegalArgumentException("wrong input...");
            }
            if (numFlat <= 0) { //don`t want to work with BC
                throw new IllegalArgumentException("wrong input...");
            }
            if (sc.hasNextInt()) {
                amountFlatsOnStage = sc.nextInt();
            } else {
                throw new IllegalArgumentException("wrong input...");
            }
            if (amountFlatsOnStage <= 0) { //don`t want to work with BC
                throw new IllegalArgumentException("wrong input...");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        int numEntrance = (numFlat % (amountFlatsOnStage * 9) == 0) ? (numFlat / (amountFlatsOnStage * 9)) : (numFlat / (amountFlatsOnStage * 9) + 1);
        System.out.printf("flat № %d is in %d entrance", numFlat, numEntrance);

    }
}
