package com.Actvidad_2.Actividad_2.time.Service;

import com.Actvidad_2.Actividad_2.time.domain.DayTime;
import com.Actvidad_2.Actividad_2.time.domain.Hours;
import com.Actvidad_2.Actividad_2.time.domain.Minutes;
import com.Actvidad_2.Actividad_2.time.domain.Seconds;
import com.Actvidad_2.Actividad_2.time.repository.DayTimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceTime {
    private final DayTimesRepository repository;

    @Autowired
    public ServiceTime(@Qualifier("in-memory") DayTimesRepository repository){
        this.repository = repository;
    }

    public DayTime dayTime(Hours hours, Minutes minutes, Seconds seconds){
        return repository.insertOne(hours, minutes, seconds);
    }

    public ArrayList findAll(){
        return repository.findAll();
    }
}
