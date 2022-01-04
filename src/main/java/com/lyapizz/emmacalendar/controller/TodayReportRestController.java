package com.lyapizz.emmacalendar.controller;

import com.lyapizz.emmacalendar.model.TodayReportResponse;
import com.lyapizz.emmacalendar.service.TodayReportService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/todayReport", produces = "application/json;charset=UTF-8")
public class TodayReportRestController {

    TodayReportService todayReportService;

    @GetMapping
    TodayReportResponse getTodayReport() {
        return todayReportService.createTodayReport();
    }

}
