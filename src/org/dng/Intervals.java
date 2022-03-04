package org.dng;

import java.util.Scanner;

public class Intervals {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("input 2  intervals [a,b] [c,d]");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sc.close();
        int x, y, z, q; //"нормализируем" исходные данные - учтем вариант когда пользователь вводит второй конец промежутка меньше первого
        if (a <= b) {
            x = a;
            y = b;
        } else {
            y = a;
            x = b;
        }
        if (c <= d) {
            z = c;
            q = d;
        } else {
            z = d;
            q = c;
        }
        if ((y < z) || (q < x)) {
            System.out.println("промежутки не пересекаются");
        } else if ((x < q) || (z < y)) {
            System.out.println("промежутки пересекаются");
        } else if ((y == z) || (x == q)) {
            System.out.println("промежутки соприкасаются");
        } else if (((x <= z) && (q <= y)) || ((z <= x) && (y <= q))) {
            System.out.println("один промежуток внутри другого");
        }
    }
}
