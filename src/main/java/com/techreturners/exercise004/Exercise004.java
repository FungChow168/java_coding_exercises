package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Exercise004 {

    private LocalDateTime dateTime = null;
    private final long secondsToAdd = 1000000000;

    public Exercise004(LocalDate date) {
        this.dateTime = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDayOfMonth(), 0, 0, 0);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime.plusSeconds(secondsToAdd);
    }
}
