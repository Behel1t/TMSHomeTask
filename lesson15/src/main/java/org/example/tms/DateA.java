package org.example.tms;
/*
1. Написать программу для вывода на консоль названия дня недели по
введенной дате.
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате ГГГГ-ММ-ДД: ");
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse(input);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("День недели: " + dayOfWeek);
    }
}
