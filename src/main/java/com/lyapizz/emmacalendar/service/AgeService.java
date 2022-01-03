package com.lyapizz.emmacalendar.service;

import com.lyapizz.emmacalendar.model.AgeResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

@Service
public class AgeService {

    private final PeriodConverter periodConverter = new PeriodConverter();

    private static final LocalDate EMMA_BIRTHDAY = LocalDate.of(2021, 10, 25);

    public AgeResponse getAge() {
        LocalDate currentDate = LocalDate.now(ZoneId.of("Europe/Moscow"));
        Period agePeriod = Period.between(EMMA_BIRTHDAY, currentDate);
        return new AgeResponse(periodConverter.convert(agePeriod));
    }
}
