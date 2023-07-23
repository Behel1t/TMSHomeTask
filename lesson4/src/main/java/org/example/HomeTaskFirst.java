/*
1. Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет -
выведите сообщения об этом.
*/
package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTaskFirst {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(array));
            System.out.print("Введите число для удаления: ");
            int num = scanner.nextInt();
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    found = true;
                    for (int j = i; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    size--;
                    i--;
                }
            }
            if (!found) {
                System.out.println("Число не найдено в массиве");
            } else {
                int[] newArray = new int[size];
                for (int i = 0; i < size; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
                System.out.print("Новый массив: ");
                for (int i : array) {
                    System.out.print(i + " ");
                }
            }
        }
}