/*
Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры.
- Вывести на экран номер документа, но блоки из трех букв заменить
на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в формате
yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате
"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
класса StringBuilder).
- Проверить содержит ли номер документа последовательность abc и
вывети сообщение содержит или нет(причем, abc и ABC считается
одинаковой последовательностью).
- Проверить начинается ли номер документа с последовательности
555.
- Проверить заканчивается ли номер документа на
последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах,
которые на вход (входным параметром) будут принимать вводимую на вход
программы строку.
 */
package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DocumentUtils {
    public static void main(String[] args) {
        String docNumber="5552-tty-3244-aBc-1t2n";
        printFirstTwoBlocks(docNumber);
        printMaskedDocNumber(docNumber);
        printLettersOnly(docNumber);
        printLettersUpper(docNumber);
        containsAbc(docNumber);
        startsWith555(docNumber);
        endsWith1a2b(docNumber);

    }
    public static void printFirstTwoBlocks(String docNumber) {
        String[] blocks = docNumber.split("-");
        System.out.println(blocks[0] + "-" + blocks[2]);
    }

    public static void printMaskedDocNumber(String docNumber) {
        String maskedNumber = docNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(maskedNumber);
    }

    public static void printLettersOnly(String docNumber) {
        String[] blocks = docNumber.split("-");
        StringBuilder letters = new StringBuilder();
        for (String block : blocks) {
            for (char c : block.toCharArray()) {
                if (Character.isLetter(c)) {
                    letters.append(Character.toLowerCase(c));
                }
            }
        }
        String formattedLetters = String.format("%s/%s/%s/%s",
                letters.substring(0, 3), letters.substring(3, 6),
                letters.substring(6, 7), letters.substring(7, 8));
        System.out.println(formattedLetters);
    }

    public static void printLettersUpper(String docNumber) {
        String[] blocks = docNumber.split("-");
        StringBuilder letters = new StringBuilder();
        for (String block : blocks) {
            for (char c : block.toCharArray()) {
                if (Character.isLetter(c)) {
                    letters.append(Character.toUpperCase(c));
                }
            }
        }
        String formattedLetters = String.format("Letters:%s/%s/%s/%s",
                letters.substring(0, 3), letters.substring(3, 6),
                letters.substring(6, 7), letters.substring(7, 8));
        System.out.println(formattedLetters);
    }

    public static void containsAbc(String docNumber) {
        Pattern pattern = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(docNumber);
        if (matcher.find()) {
            System.out.println("Document number contains 'abc'");
        } else {
            System.out.println("Document number does not contain 'abc'");
        }
    }

    public static void startsWith555(String docNumber) {
        if (docNumber.startsWith("555")) {
            System.out.println("Document number starts with '555'");
        } else {
            System.out.println("Document number does not start with '555'");
        }
    }

    public static void endsWith1a2b(String docNumber) {
        if (docNumber.endsWith("1a2b")) {
            System.out.println("Document number ends with '1a2b'");
        } else {
            System.out.println("Document number does not end with '1a2b'");
        }
    }
}
