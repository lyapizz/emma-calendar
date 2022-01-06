package com.lyapizz.emmacalendar.service;

import com.lyapizz.emmacalendar.util.DateUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static com.lyapizz.emmacalendar.util.RussianTranslationUtils.*;

@Service
public class TodayService {

    public String getCurrentDate() {
        LocalDate currentDate = DateUtils.currentDate();
        return createTodayString(currentDate);
    }

    /**
     * example: шестое января, четверг
     */
    private String createTodayString(LocalDate currentDate) {
        return getRussianDayOfMonth(currentDate.getDayOfMonth()) + " "
                + getRussianMonth(currentDate.getMonthValue()) + ", "
                + getRussianDayOfWeek(currentDate.getDayOfWeek());
    }

}
