package com.company.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Flight {

    private final String from;
    private final String to;
    private final LocalDate date;

    public Flight(String from, String to, String date) {
        this.from = from;
        this.to = to;
        this.date = parseInputDate(date);
    }

    private static LocalDate parseInputDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String from() {
        return from;
    }

    public String to() {
        return to;
    }

    public LocalDate date() {
        return date;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                '}';
    }
}
