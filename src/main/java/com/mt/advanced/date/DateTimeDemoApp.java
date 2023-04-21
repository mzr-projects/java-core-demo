package com.mt.advanced.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeDemoApp {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2023-05-01 10:15:30 Asia/Tehran", formatter);
        System.out.println(zonedDateTime);

        String dateInString = "20230506";
        LocalDate date = LocalDate.parse(dateInString, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date);

        Date localDateTime = new Date();
        DateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        s.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("Local Time : " + localDateTime);
        System.out.println("Time in GMT : " + s.format(localDateTime));

        Instant now = Instant.now();
        ZonedDateTime zdt = ZonedDateTime.ofInstant(now, ZoneId.systemDefault());
        System.out.println("Instant Local : " + zdt);

        Instant instant = Instant.now();
        System.out.println("Instant GMT : "+instant.toString());
    }
}
