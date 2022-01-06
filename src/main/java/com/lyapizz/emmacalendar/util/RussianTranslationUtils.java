package com.lyapizz.emmacalendar.util;

import java.time.DayOfWeek;
import java.util.Map;

public class RussianTranslationUtils {

    private static final Map<Integer, String> russianDayOfMonthMap = Map.ofEntries(
            Map.entry(1, "первое"),
            Map.entry(2, "второе"),
            Map.entry(3, "третье"),
            Map.entry(4, "четвертое"),
            Map.entry(5, "пятое"),
            Map.entry(6, "шестое"),
            Map.entry(7, "седьмое"),
            Map.entry(8, "восьмое"),
            Map.entry(9, "девятое"),
            Map.entry(10, "десятое"),
            Map.entry(11, "одиннадцатое"),
            Map.entry(12, "двенадцатое"),
            Map.entry(13, "тринадцатое"),
            Map.entry(14, "четырнадцатое"),
            Map.entry(15, "пятнадцатое"),
            Map.entry(16, "шестнадцатое"),
            Map.entry(17, "семнадцатое"),
            Map.entry(18, "восемнадцатое"),
            Map.entry(19, "девятнадцатое"),
            Map.entry(20, "двадцатое"),
            Map.entry(21, "двадцать первое"),
            Map.entry(22, "двадцать второе"),
            Map.entry(23, "двадцать третье"),
            Map.entry(24, "двадцать четвертое"),
            Map.entry(25, "двадцать пятое"),
            Map.entry(26, "двадцать шестое"),
            Map.entry(27, "двадцать седьмое"),
            Map.entry(28, "двадцать восьмое"),
            Map.entry(29, "двадцать девятое"),
            Map.entry(30, "тридцатое"),
            Map.entry(31, "тридцать первое"));


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

    private RussianTranslationUtils() {
    }

    public static String getRussianDayOfMonth(int dayOfMonth) {
        return russianDayOfMonthMap.get(dayOfMonth);
    }

    public static String getRussianMonth(int monthValue) {
        return russianMonthsMap.get(monthValue);
    }

    public static String getRussianDayOfWeek(DayOfWeek dayOfWeek) {
        return russianDayOfWeekMap.get(dayOfWeek);
    }
}
