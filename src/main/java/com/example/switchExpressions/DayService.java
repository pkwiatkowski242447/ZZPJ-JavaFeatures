package com.example.switchExpressions;

public class DayService {

    int getDayNumberOfLettersForWorkday(Day day) {
        // return number of letters for working days or throw exception for the other

        return switch (day) {
            case  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> day.name().length();
            default -> throw new IllegalStateException();
        };
    }
}
