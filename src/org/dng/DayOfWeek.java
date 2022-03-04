package org.dng;

import java.util.Scanner;

enum DayWeek{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

public class DayOfWeek {
    public static void main(String[] args) {
        int numDay=0;
        System.out.println("input day of the week number");
        try (Scanner sc = new Scanner(System.in)){ //sc.close();
            if (sc.hasNextInt()) {
                numDay = sc.nextInt();
            }
            else{
                throw new Exception("wrong input...");
            }
            if ( (numDay<1)||(7<numDay) ){
                throw new Exception("number must be from 1 to 7");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.printf("the name of %d day of week is: ", numDay);
        switch (numDay){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        System.out.println(DayWeek.values()[numDay-1]);
    }
}
