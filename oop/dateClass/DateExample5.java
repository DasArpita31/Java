package oop.dateClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample5 {
    public static void main(String[] args) {
        //custom format
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

    }
}
