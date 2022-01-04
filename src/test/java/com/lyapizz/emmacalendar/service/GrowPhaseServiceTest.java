package com.lyapizz.emmacalendar.service;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GrowPhaseServiceTest {

    GrowPhaseService subject = new GrowPhaseService();

    @Test
    void isGrowPhaseDate_positive() {
        assertTrue(subject.isGrowPhaseDate(LocalDate.of(2022, 2, 4)));
    }

    @Test
    void isGrowPhaseDate_negative() {
        assertFalse(subject.isGrowPhaseDate(LocalDate.of(2022, 1, 4)));
    }

    @Test
    void isGrowPhaseDate_null() {
        assertFalse(subject.isGrowPhaseDate(null));
    }

    @Test
    void isSunnyDate_positive() {
        assertTrue(subject.isSunnyDate(LocalDate.of(2022, 1, 17)));
    }

    @Test
    void isSunnyDate_negative() {
        assertFalse(subject.isSunnyDate(LocalDate.of(2022, 2, 4)));
    }

    @Test
    void isSunnyDate_null() {
        assertFalse(subject.isSunnyDate(null));
    }
}