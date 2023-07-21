// 2.Условные операторы:Программа для вывода названия поры года по номеру месяца с использованием оператора if-else.
package org.example;
import java.util.Scanner;

public class IfLesson {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner month=new Scanner(System.in);
        int number= month.nextInt();
        if(number==1){
            System.out.println("Январь");
        }
        else if (number==2) {
            System.out.println("Февраль");
        }
        else if (number==3) {
            System.out.println("Март");
        }
        else if (number==4){
            System.out.println("Апрель");

        }
        else if (number==5) {
            System.out.println("Май");
        }
        else if (number==6) {
            System.out.println("Июнь");
        }
        else if (number==7) {
            System.out.println("Июль");
        }
        else if (number==8) {
            System.out.println("Август");
        }
        else if (number==9) {
            System.out.println("Сентябрь");
        }
        else if (number==10) {
            System.out.println("Октябрь");
        }
        else if (number==11) {
            System.out.println("Ноябрь");
        }
        else if (number==12) {
            System.out.println("Декабрь");
        }
        else {
            System.out.println("Такого месяца не существует");
        }
        }
    }
