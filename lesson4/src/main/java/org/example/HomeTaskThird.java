/*
3. Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны).
*/
package org.example;
import java.util.Arrays;

    public class HomeTaskThird {
        public static void main(String[] args) {
            int[] array1 = new int[5];
            int[] array2 = new int[5];

            for(int i = 0; i < 5; ++i) {
                array1[i] = (int)(Math.random() * 6.0);
                array2[i] = (int)(Math.random() * 6.0);
            }

            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            double mid1 = 0.0;
            double mid2 = 0.0;
            double sum = 0.0;
            int[] var9 = array1;
            int var10 = array1.length;

            int var11;
            int i;
            for(var11 = 0; var11 < var10; ++var11) {
                i = var9[var11];
                sum += (double)i;
            }

            mid1 = sum / (double)array1.length;
            sum = 0.0;
            var9 = array2;
            var10 = array2.length;

            for(var11 = 0; var11 < var10; ++var11) {
                i = var9[var11];
                sum += (double)i;
            }

            mid2 = sum / (double)array2.length;
            if (mid1 > mid2) {
                System.out.println("Среднее арифметическое первого массива (" + mid1 + ") > среднего арифметического второго массива (" + mid2 + ")");
            } else if (mid1 < mid2) {
                System.out.println("Среднее арифметическое первого массива (" + mid1 + ") <  среднего арифметического второго массива (" + mid2 + ")");
            } else {
                System.out.println("Средние арифметические массивов равны (" + mid1 + ")");
            }

        }
    }
