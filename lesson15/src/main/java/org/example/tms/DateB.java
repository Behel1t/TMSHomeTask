package org.example.tms;

import java.time.LocalDate;
import java.time.DayOfWeek;
public class DateB {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextTuesday = today.with(DayOfWeek.TUESDAY);
        if (nextTuesday.isBefore(today)) {
            nextTuesday = nextTuesday.plusWeeks(1);
        }
        System.out.println("Дата следующего вторника: " + nextTuesday);
    }
}
