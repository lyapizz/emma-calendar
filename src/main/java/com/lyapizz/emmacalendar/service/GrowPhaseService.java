package com.lyapizz.emmacalendar.service;

import com.lyapizz.emmacalendar.util.DateUtils;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class GrowPhaseService {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private static Set<String> growPhaseDays = Set.of("2022-01-03");
    private static Set<String> sunnyDays = Set.of("2022-01-03");

    public GrowPhaseService() {
        growPhaseDays = getDaysFromFile("/growPhaseDays.txt");
        sunnyDays = getDaysFromFile("/sunnyDays.txt");
    }

    private Set<String> getDaysFromFile(String fileName) {
        return new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName))).lines()
                .collect(Collectors.toSet());
    }

    public boolean isTodayAGrowPhase() {
        return isGrowPhaseDate(DateUtils.currentDate());
    }

    protected boolean isGrowPhaseDate(LocalDate date) {
        if (date == null) {
            return false;
        }
        return growPhaseDays.contains(date.format(formatter));
    }

    public boolean isTodayASunnyDay() {
        return isSunnyDate(DateUtils.currentDate());
    }

    protected boolean isSunnyDate(LocalDate date) {
        if (date == null) {
            return false;
        }
        return sunnyDays.contains(date.format(formatter));
    }

}
