package com.lyapizz.emmacalendar.scheduler;

import com.lyapizz.emmacalendar.controller.TodayReportRestController;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class WakeUpScheduler {

    TodayReportRestController todayReportRestController;

    @Scheduled(cron = "0 0,30 9,10,11,12,13 ? * * ", zone = "Europe/Moscow")
    public void scheduleTaskUsingCronExpression() {
        log.info(todayReportRestController.getTodayReport().toString());
    }
}
