package com.Actvidad_2.Actividad_2.time.domain;

import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

public enum TimeUniEnum {
    MILLISECONDS,
    SECONDS,
    MINUTES,
    HOURS;

    @Bean()
    public static Long fromHour(TimeUniEnum unit, LocalTime time){

        int hours = time.getHour();
        int minutes = time.getMinute();
        int seconds = time.getSecond();
        int milliseconds = time.getNano();

        switch (unit){
            case HOURS:
                return hours*1L;
            case MINUTES:
                return hours * (60L) + minutes;
            case SECONDS:
                return seconds + hours * (60L * 60L) + minutes * (60L);
            case MILLISECONDS:
                return (seconds*1000) + (hours*60L*60L*1000)+(minutes*60L*1000)+ (milliseconds*1000000L);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
