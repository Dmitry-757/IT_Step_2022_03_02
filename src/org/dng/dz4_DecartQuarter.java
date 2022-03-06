package org.dng;

import java.util.Scanner;

public class dz4_DecartQuarter {
    public static void main(String[] args) {
        int x, y;
        System.out.println("input point`s coordinates on the Cartesian plane (x,y)");
        try (Scanner sc = new Scanner(System.in)) { //sc.close();
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                y = sc.nextInt();
            } else {
                throw new IllegalArgumentException("wrong input...");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        if ((0 < x) && (0 < y)) {
            System.out.println("the point is placed in I quarter");
        } else if ((x < 0) && (0 < y)) {
            System.out.println("the point is placed in II quarter");
        } else if ((x < 0) && (y < 0)) {
            System.out.println("the point is placed in III quarter");
        } else if ((0 < x) && (y < 0)) {
            System.out.println("the point is placed in IV quarter");
        } else {
            System.out.println("the point is placed on one of coordinate axis");
        }
    }
}
