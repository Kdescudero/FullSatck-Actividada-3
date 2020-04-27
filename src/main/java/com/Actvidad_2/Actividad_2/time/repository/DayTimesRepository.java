package com.Actvidad_2.Actividad_2.time.repository;

import com.Actvidad_2.Actividad_2.time.domain.DayTime;
import com.Actvidad_2.Actividad_2.time.domain.Hours;
import com.Actvidad_2.Actividad_2.time.domain.Minutes;
import com.Actvidad_2.Actividad_2.time.domain.Seconds;

import java.util.ArrayList;

public interface DayTimesRepository {
    DayTime insertOne(Hours hours, Minutes minutes, Seconds seconds);

    ArrayList findAll();
}
