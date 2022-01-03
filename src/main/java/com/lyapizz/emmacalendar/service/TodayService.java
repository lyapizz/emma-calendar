package com.lyapizz.emmacalendar.service;

import com.lyapizz.emmacalendar.model.TodayResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
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

    public TodayResponse getCurrentDate() {
        LocalDate currentDate = LocalDate.now(ZoneId.of("Europe/Moscow"));
        return new TodayResponse(createTodayString(currentDate));
    }

    private String createTodayString(LocalDate currentDate) {
        return currentDate.getDayOfMonth() + " " + getRussianMonth(currentDate.getMonthValue());
    }

    private String getRussianMonth(int monthValue) {
        return russianMonthsMap.get(monthValue);
    }
}
