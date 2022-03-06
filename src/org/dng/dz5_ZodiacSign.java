package org.dng;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название
 * года по китайскому календарю.
 * Пример входных данных:
 * 5 12 1974
 * Вывод:
 * Знак: Стрелец
 * Год: Тигра
 */
public class dz5_ZodiacSign {
    public static void main(String[] args) {
        int d, m, y;
        System.out.println("input birth day (d m y)");
        try (Scanner sc = new Scanner(System.in)) { //sc.close();
            if (sc.hasNextInt()) {
                d = sc.nextInt();
                m = sc.nextInt();
                y = sc.nextInt();
            } else {
                throw new IllegalArgumentException("wrong input...");
            }
            //проверку на корректность введенных данных делать лень ))
            if ((d > 31) || (d < 1)) {
                throw new IllegalArgumentException("number of day must be between 1 and 31");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        //LocalDate birthDay = LocalDate.of(y,m,d);
        int[] birthDay = {d, m, y};

        int[][] period = new int[12][4];
        //овен 21.03-20.04
        period[0][0] = 21;
        period[0][1] = 3;
        period[0][2] = 20;
        period[0][3] = 4;
        //телец 21.04-21.05
        period[1][0] = 21;
        period[1][1] = 4;
        period[1][2] = 21;
        period[1][3] = 5;
        //близнецы 22.05-21.06
        period[2][0] = 21;
        period[2][1] = 5;
        period[2][2] = 20;
        period[2][3] = 6;
        //рак 22.06-22.07
        period[3][0] = 22;
        period[3][1] = 6;
        period[3][2] = 22;
        period[3][3] = 7;
        //лев 23.07-23.08
        period[4][0] = 23;
        period[4][1] = 7;
        period[4][2] = 23;
        period[4][3] = 8;
        //дева 24.08-22.09
        period[5][0] = 24;
        period[5][1] = 8;
        period[5][2] = 22;
        period[5][3] = 9;
        //весы 23.09-22.10
        period[6][0] = 23;
        period[6][1] = 9;
        period[6][2] = 22;
        period[6][3] = 10;
        //скорпион 23.10-22.11 ?????
        period[7][0] = 23;
        period[7][1] = 10;
        period[7][2] = 22;
        period[7][3] = 11;
        //стрелец 23.11-21.12 ????????
        period[8][0] = 23;
        period[8][1] = 1;
        period[8][2] = 21;
        period[8][3] = 12;
        //козерог 22.12-20.01 !!!!!!!!
        period[9][0] = 22;
        period[9][1] = 12;
        period[9][2] = 20;
        period[9][3] = 1;
        //водолей 21.01-19.02
        period[10][0] = 21;
        period[10][1] = 1;
        period[10][2] = 19;
        period[10][3] = 2;
        //hs,s 20.02-20.03
        period[11][0] = 20;
        period[11][1] = 2;
        period[11][2] = 20;
        period[11][3] = 3;

        String[] sign = new String[12];
        sign[0] = "овен";
        sign[1] = "телец";
        sign[2] = "близнецы";
        sign[3] = "рак";
        sign[4] = "лев";
        sign[5] = "дева";
        sign[6] = "весы";
        sign[7] = "скорпион";
        sign[8] = "стрелец";
        sign[9] = "козерог";
        sign[10] = "водолей";
        sign[11] = "рыбы";

        for (int i = 0; i < 12; i++) {
            if ((period[i][1] == m) && (period[i][0] <= d) && (d <= 31)) {
                System.out.println("Zodiac sign is " + sign[i]);
                break;
            } else if ((period[i][3] == m) && (d <= period[i][2]) && (1 <= d)) {
                System.out.println("Zodiac sign is " + sign[i]);
                break;
            }
        }//for (int i = 0; i < 11; i++)

        //year in china
        int age = y - 1924;
        int chineseYear = age % 12;

        System.out.print("You was born in year of ");
        switch (chineseYear) {
            case 0 -> {
                System.out.println("rat");
            }
            case 1 -> {
                System.out.println("bull");
            }
            case 2 -> {
                System.out.println("tiger");
            }
            case 3 -> {
                System.out.println("rabbit/hare");
            }
            case 4 -> {
                System.out.println("dragon");
            }
            case 5 -> {
                System.out.println("snake");
            }
            case 6 -> {
                System.out.println("horse");
            }
            case 7 -> {
                System.out.println("goat/коза");
            }
            case 8 -> {
                System.out.println("monkey");
            }
            case 9 -> {
                System.out.println("cock");
            }
            case 10 -> {
                System.out.println("dog");
            }
            case 11 -> {
                System.out.println("pig");
            }

        }
    }
}
