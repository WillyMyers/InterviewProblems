package main.java.hackerrank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConversion {

    static final DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
    static final DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static String timeConversion(String s) {
        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.ENGLISH)).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        //return LocalTime.parse("06:00 PM", DateTimeFormatter.ofPattern("hh:mm a", Locale.US))
        //.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public static void main(String[] args) {

        System.out.println("Should be '12:01:00' - " + timeConversion("12:01:00PM"));
        System.out.println("Should be '00:01:00' - " + timeConversion("12:01:00AM"));
    }
}
