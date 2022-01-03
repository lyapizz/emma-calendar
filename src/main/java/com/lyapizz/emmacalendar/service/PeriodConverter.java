package com.lyapizz.emmacalendar.service;

import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodConverter {

    public String convert(Period agePeriod) {
        if (agePeriod == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        appendYears(sb, agePeriod);
        appendMonths(sb, agePeriod);
        appendDays(sb, agePeriod);
        return deleteLastWhitespace(sb).toString();
    }

    private StringBuilder deleteLastWhitespace(StringBuilder sb) {
        return sb.deleteCharAt(sb.length() - 1);
    }

    private void appendYears(StringBuilder sb, Period agePeriod) {
        long years = agePeriod.get(ChronoUnit.YEARS);
        if (years != 0) {
            sb.append(years).append(" ").append(createYearString(years)).append(" ");
        }
    }

    private String createYearString(long years) {
        if (years == 1) {
            return "год";
        } else if (years == 2 || years == 3 || years == 4) {
            return "года";
        } else {
            return "лет";
        }
    }

    private void appendMonths(StringBuilder sb, Period agePeriod) {
        long months = agePeriod.get(ChronoUnit.MONTHS);
        if (months != 0) {
            sb.append(months).append(" ").append(createMonthString(months)).append(" ");
        }
    }

    private String createMonthString(long months) {
        if (months == 1) {
            return "месяц";
        } else if (months == 2 || months == 3 || months == 4) {
            return "месяца";
        } else {
            return "месяцев";
        }
    }

    private void appendDays(StringBuilder sb, Period agePeriod) {
        long days = agePeriod.get(ChronoUnit.DAYS);
        if (days != 0) {
            sb.append(days).append(" ").append(createDaysString(days)).append(" ");
        }
    }

    private String createDaysString(long days) {
        if (days == 1 || days == 21) {
            return "день";
        } else if (days == 2 || days == 3 || days == 4 || days == 22 || days == 23 || days == 24) {
            return "дня";
        } else {
            return "дней";
        }
    }

}
