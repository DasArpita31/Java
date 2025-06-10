package oop.dateClass;

import java.time.LocalDateTime;

public class DateExample8 {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2025, 01, 1, 00, 00, 00);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 01, 1, 00, 00, 00);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        if(dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1+" is earlier than "+dateTime2);
        }
        else if(dateTime1.isAfter(dateTime2)){
        System.out.println(dateTime1+" is later than "+dateTime2);
        }
        else if(dateTime1.isEqual(dateTime2)){
        System.out.println(dateTime1+" is equal to "+dateTime2);
        }
    }
}
