package com.lyapizz.emmacalendar.controller;

import com.lyapizz.emmacalendar.model.AgeResponse;
import com.lyapizz.emmacalendar.service.AgeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/age", produces = "application/json;charset=UTF-8")
public class AgeRestController {

    AgeService ageService;

    @GetMapping
    AgeResponse getAge() {
        return ageService.getAge();
    }

}
