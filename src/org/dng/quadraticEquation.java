package org.dng;

import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        int a, b, c;
        double x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("input coefficients a, b, c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        if (a == 0) {
            x1 = -c / b;
            System.out.println("radical is " + x1);
        } else {
            double d;
            d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("solution is absent in real numbers");
            } else {
                x1 = (-b + Math.sqrt(d))/(2*a);
                x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.printf("radicals are: x1 = %f, x2 = %f", x1, x2);
            }
        }
    }
}
