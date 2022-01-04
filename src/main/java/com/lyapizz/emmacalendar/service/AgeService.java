package com.lyapizz.emmacalendar.service;

import com.lyapizz.emmacalendar.util.DateUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class AgeService {

    private final PeriodConverter periodConverter = new PeriodConverter();

    private static final LocalDate EMMA_BIRTHDAY = LocalDate.of(2021, 10, 25);

    public String getAge() {
        LocalDate currentDate = DateUtils.currentDate();
        Period agePeriod = Period.between(EMMA_BIRTHDAY, currentDate);
        return periodConverter.convert(agePeriod);
    }
}
