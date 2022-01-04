package com.lyapizz.emmacalendar.model;

import lombok.Value;

@Value
public class TodayReportResponse {
    String currentDate;
    String age;
    boolean isGrowPhase;
    boolean isSunnyDay;
}
