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
            int[] array1 = new int[5];

            for(int i = 0; i < 5; ++i) {
                array1[i] = (int)(Math.random() * 10.0);
            }

            System.out.println(Arrays.toString(array1));
            System.out.println("Введите число");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            boolean numberExists = false;

            int newSize;
            for(newSize = 0; newSize < array1.length; ++newSize) {
                if (array1[newSize] == num) {
                    numberExists = true;
                    break;
                }
            }

            if (numberExists) {
                newSize = array1.length;

                for(int i = 0; i < array1.length; ++i) {
                    if (array1[i] == num) {
                        --newSize;
                    }
                }

                int[] newArray = new int[newSize];
                int newIndex = 0;

                int i;
                for(i = 0; i < array1.length; ++i) {
                    if (array1[i] != num) {
                        newArray[newIndex] = array1[i];
                        ++newIndex;
                    }
                }

                System.out.println("Новый массив без указанного числа:");

                for(i = 0; i < newSize; ++i) {
                }

                System.out.print(Arrays.toString(newArray));
                } else {
                System.out.println("Указанное число не найдено в массиве.");
                }

            }
        }

