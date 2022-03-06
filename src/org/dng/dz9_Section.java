package org.dng;

import java.util.Scanner;

/**
 Задание 9
 Даны координаты начала и координаты конца отрезка.
 Если считать отрезок обозначением горки, то в одном случае он обозначает спуск, в другом – подъем. Определить и
 вывести на экран – спуск это или подъем, ровная дорога или вообще отвесная
 */
public class dz9_Section {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        System.out.println("input coordinates of begin and end of section (x1 y1 x2 y2)");
        try (Scanner sc = new Scanner(System.in)) { //sc.close();
            if (sc.hasNextInt()) {
                x1 = sc.nextInt();
                y1 = sc.nextInt();
                x2 = sc.nextInt();
                y2 = sc.nextInt();
            } else {
                throw new IllegalArgumentException("wrong input...");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String vert="";
        if (x1==x2){
            vert = "vertical";
        }
        if (y1 < y2) {
            System.out.println(vert+" ascent");
        } else if (y2 < y1) {
            System.out.println(vert+" descent");
        } else if (y1 == y2) {
            System.out.println("horizontal");
        }
    }
}
