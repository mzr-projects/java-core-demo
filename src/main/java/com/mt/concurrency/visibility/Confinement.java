package com.mt.concurrency.visibility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Confinement {

    /*
     * ThreadLocal enforces the thread confinement
     * ThreadLocal get and set methods associate values to a particular thread instance
     * Here DateFormat is not thread safe but the df field will be thread-safe
     * */
    private static final ThreadLocal<DateFormat> df = ThreadLocal.withInitial(
            () -> new SimpleDateFormat("yyyy-MM-dd")
    );

    private final DateFormat synchronisedDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;

    public static String formatByThreadLocal(Date date) {
        return df.get().format(date);
    }

    /*
     * Since here we've used local variables, and they are only visible through a single thread not between threads,
     * so we have no visibility problem here.
     * */
    public String formatByStackThreadVariables(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public synchronized String formatBySynchronization(Date date) {
        return synchronisedDateFormat.format(date);
    }

    /*
     * This is much faster than other approaches because DateTimeFormatter is immutable and thread-safe, so we don't need
     * some additional stuffs to make this operation thread-safe
     * */
    public static String formatByDateTimeFormatter(LocalDate date) {
        return dtf.format(date);
    }

    public static void main(String[] args) {
        System.out.println(formatByThreadLocal(new Date()));
    }
}
