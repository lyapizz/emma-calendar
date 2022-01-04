package com.lyapizz.emmacalendar.util;

import java.time.LocalDate;
import java.time.ZoneId;

public class DateUtils {

    private DateUtils() {
    }

    public static LocalDate currentDate() {
        return LocalDate.now(ZoneId.of("Europe/Moscow"));
    }
}
