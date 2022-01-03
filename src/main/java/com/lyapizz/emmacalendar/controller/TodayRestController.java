package com.lyapizz.emmacalendar.controller;

import com.lyapizz.emmacalendar.model.TodayResponse;
import com.lyapizz.emmacalendar.service.TodayService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/today", produces = "application/json;charset=UTF-8")
public class TodayRestController {

    TodayService todayService;

    @GetMapping
    TodayResponse getCurrentDate() {
        return todayService.getCurrentDate();
    }

}
