package com.mt.date;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemoApp {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2023-05-01 10:15:30 Asia/Tehran", formatter);
        System.out.println(zonedDateTime);

        String dateInString = "20230506";
        LocalDate date = LocalDate.parse(dateInString, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date);
    }
}
