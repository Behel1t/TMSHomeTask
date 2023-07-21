package org.example;/*
0. Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).
 */
import java.util.Scanner;

public class HomeTaskZero {
    public static void main(String[] args) {
        System.out.println("Задайте число");
        Scanner number = new Scanner(System.in);
        int value = number.nextInt();
        int[] array = new int[]{1, 2, 3, 4, 5};
        boolean flag = false;

        for(int i = 0; i < array.length; ++i) {
            if (array[i] == value) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Число в массиве");
        } else {
            System.out.println("Число не в массиве");
        }

    }

}
