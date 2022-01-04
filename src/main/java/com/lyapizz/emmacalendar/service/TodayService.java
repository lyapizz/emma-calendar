package com.lyapizz.emmacalendar.service;

import com.lyapizz.emmacalendar.util.DateUtils;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Map;

@Service
public class TodayService {

    private static final Map<Integer, String> russianMonthsMap = Map.ofEntries(
            Map.entry(1, "января"),
            Map.entry(2, "февраля"),
            Map.entry(3, "марта"),
            Map.entry(4, "апреля"),
            Map.entry(5, "мая"),
            Map.entry(6, "июня"),
            Map.entry(7, "июля"),
            Map.entry(8, "августа"),
            Map.entry(9, "сентября"),
            Map.entry(10, "октября"),
            Map.entry(11, "ноября"),
            Map.entry(12, "декабря"));

    private static final Map<DayOfWeek, String> russianDayOfWeekMap = Map.ofEntries(
            Map.entry(DayOfWeek.MONDAY, "понедельник"),
            Map.entry(DayOfWeek.TUESDAY, "вторник"),
            Map.entry(DayOfWeek.WEDNESDAY, "среда"),
            Map.entry(DayOfWeek.THURSDAY, "четверг"),
            Map.entry(DayOfWeek.FRIDAY, "пятница"),
            Map.entry(DayOfWeek.SATURDAY, "суббота"),
            Map.entry(DayOfWeek.SUNDAY, "воскресенье"));

    public String getCurrentDate() {
        LocalDate currentDate = DateUtils.currentDate();
        return createTodayString(currentDate);
    }

    private String createTodayString(LocalDate currentDate) {
        return currentDate.getDayOfMonth() + " " + getRussianMonth(currentDate.getMonthValue()) + ", " + getRussianDayOfWeek(currentDate.getDayOfWeek());
    }

    private String getRussianDayOfWeek(DayOfWeek dayOfWeek) {
        return russianDayOfWeekMap.get(dayOfWeek);
    }

    private String getRussianMonth(int monthValue) {
        return russianMonthsMap.get(monthValue);
    }
}
