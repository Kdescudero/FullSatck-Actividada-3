package com.Actvidad_2.Actividad_2.time.repository;


import com.Actvidad_2.Actividad_2.time.domain.DayTime;
import com.Actvidad_2.Actividad_2.time.domain.Hours;
import com.Actvidad_2.Actividad_2.time.domain.Minutes;
import com.Actvidad_2.Actividad_2.time.domain.Seconds;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Qualifier("in-memory")
public class MemoryDayTimesRepo implements DayTimesRepository {

    private final ArrayList state = new ArrayList();

    @Override
    public DayTime insertOne(Hours hours, Minutes minutes, Seconds seconds) {
        DayTime dayTime = DayTime.of(hours, minutes, seconds);
        state.add(dayTime);
        return dayTime;
    }

    @Override
    public ArrayList findAll() {  return state; }
}

