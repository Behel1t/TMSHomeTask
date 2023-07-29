/*
2. Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.
 */
package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTaskSecond {
    public static void main(String[] args) {
        System.out.println("Задайте размер массива");
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        int[] array = new int[numb];

        for(int i = 0; i < array.length; ++i) {
            array[i] = (int)(Math.random() * 10.0);
        }

        System.out.println(Arrays.toString(array));
        double max = (double)array[0];
        double min = (double)array[0];
        double mid = 0.0;

        for(int i = 0; i < array.length; ++i) {
            if (max < (double)array[i]) {
                max = (double)array[i];
            }

            if (min > (double)array[i]) {
                min = (double)array[i];
            }

            if (array.length > 0) {
                double sum = 0.0;

                for(int j = 0; j < array.length; ++j) {
                    sum += (double)array[j];
                }

                mid = sum / (double)array.length;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("mid = " + mid);
    }
}
