package com.lyapizz.emmacalendar.service;

import org.junit.jupiter.api.Test;

import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeriodConverterTest {

    PeriodConverter subject = new PeriodConverter();

    @Test
    void convert_null() {
        String result = subject.convert(null);
        assertEquals("", result);
    }

    @Test
    void convert_all_units() {
        String result = subject.convert(Period.of(1, 2, 3));
        assertEquals("1 год 2 месяца 3 дня", result);
    }

    @Test
    void convert_withoutYears() {
        String result = subject.convert(Period.of(0, 2, 9));
        assertEquals("2 месяца 9 дней", result);
    }

    @Test
    void convert_withoutMonths() {
        String result = subject.convert(Period.of(1, 0, 1));
        assertEquals("1 год 1 день", result);
    }

    @Test
    void convert_withoutDays() {
        String result = subject.convert(Period.of(1, 1, 0));
        assertEquals("1 год 1 месяц", result);
    }

    @Test
    void convert_daysAfterTen() {
        String result = subject.convert(Period.of(1, 0, 11));
        assertEquals("1 год 11 дней", result);
    }

    @Test
    void convert_daysAfterTwenety() {
        String result = subject.convert(Period.of(1, 0, 21));
        assertEquals("1 год 21 день", result);
    }
}