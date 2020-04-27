package com.Actvidad_2.Actividad_2.time.controllers;

import com.Actvidad_2.Actividad_2.time.Service.ServiceTime;
import com.Actvidad_2.Actividad_2.time.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/v1/time")
@RestController
@RequiredArgsConstructor
public class timeController {

    private final ServiceTime services;

    @PostMapping
    public DayTime dayTime(@RequestBody DayTime timeBody){
        return services.dayTime(timeBody.getHours(), timeBody.getMinutes(), timeBody.getSeconds());
    }

    @GetMapping
    public ArrayList findAll() {
        return services.findAll();
    }
}
