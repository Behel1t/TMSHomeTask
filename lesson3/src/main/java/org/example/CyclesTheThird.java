// 3.Циклы: Программа для вывода суммы чисел до числа заданного пользователем.
package org.example;
import java.util.Scanner;

public class CyclesTheThird {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner a=new Scanner(System.in);
        int number= a.nextInt();
        int sum=0;
        for (int i=1;i<=number;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
