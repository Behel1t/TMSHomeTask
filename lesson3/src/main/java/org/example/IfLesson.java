// 2.Условные операторы:Программа для вывода названия поры года по номеру месяца с использованием оператора if-else.
package org.example;
import java.util.Scanner;

public class IfLesson {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner month=new Scanner(System.in);
        int number= month.nextInt();
        if(number==1 || number==2 || number==12){
            System.out.println("Зима");
        }
        else if (number==3 || number==4 || number==5) {
            System.out.println("Весна");
        }
        else if (number==6 || number==7 || number==8) {
            System.out.println("Лето");
        }
        else if (number==9 || number==10 || number==11){
            System.out.println("Осень");
        }
        else {
            System.out.println("Такого месяца не существует");
        }

    }

}
