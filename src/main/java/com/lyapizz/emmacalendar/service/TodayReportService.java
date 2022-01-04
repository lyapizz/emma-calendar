package com.lyapizz.emmacalendar.service;

import com.lyapizz.emmacalendar.model.TodayReportResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodayReportService {

    private final TodayService todayService;
    private final AgeService ageService;
    private final GrowPhaseService growPhaseService;

    public TodayReportResponse createTodayReport() {
        return new TodayReportResponse(todayService.getCurrentDate(), ageService.getAge(),
                growPhaseService.isTodayAGrowPhase(), growPhaseService.isTodayASunnyDay());
    }

}
