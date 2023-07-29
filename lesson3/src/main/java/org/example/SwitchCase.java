// 1.Условные операторы:Программа для вывода названия поры года по номеру месяца с использованием оператора switch-case.
package org.example;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner month=new Scanner(System.in);
        int number= month.nextInt();
        switch (number){
            case 1,2,12:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}
