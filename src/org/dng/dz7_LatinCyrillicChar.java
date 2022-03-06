package org.dng;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Пользователь вводит с клавиатуры букву. Программа
 * должна определить, в какой раскладке введена буква – в латинской или кирилице. Вывести в консоль: «латиница», если
 * буква введена латиницей или «кирилица», если буква относится к кирилическому алфавиту. Если введена цифра, а не
 * буква, вывести «цифра». Если символ не относится ни к буквам, ни к цифрам, вывести «невозможно определить»
 */
public class dz7_LatinCyrillicChar {
    public static void main(String[] args) {
        String ch;
        System.out.println("input character");
        Pattern latinPattern = Pattern.compile("[A-Za-z]*");
        Pattern cyrillicPattern = Pattern.compile("[А-Яа-я]*");
        Pattern numPattern = Pattern.compile("[0-9]*");
        try (Scanner sc = new Scanner(System.in)) { //sc.close();
            if (sc.hasNext(latinPattern)) {
                System.out.println("Latin character");
            } else if (sc.hasNext(cyrillicPattern)) {
                System.out.println("Cyrillic character");
            } else if (sc.hasNext(numPattern)) {
                System.out.println("Digit");
            } else {
                throw new IllegalArgumentException("input only Latin, Cyrillic character or digit !");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

    }
}
