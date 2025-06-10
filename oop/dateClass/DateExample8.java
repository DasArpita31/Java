package oop.dateClass;

import java.time.LocalDateTime;

public class DateExample8 {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2025, 06, 20, 6, 45, 05);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 01, 1, 00, 00, 00);

        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}
