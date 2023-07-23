package org.example;/*
0. Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).
 */
import java.util.Scanner;

public class HomeTaskZero {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int searchNumber = scanner.nextInt();
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Число " + searchNumber + " найдено в массиве.");
        } else {
            System.out.println("Число " + searchNumber + " не найдено в массиве.");
        }
    }
}


