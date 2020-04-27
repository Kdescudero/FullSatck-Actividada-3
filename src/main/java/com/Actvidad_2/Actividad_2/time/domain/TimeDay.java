package com.Actvidad_2.Actividad_2.time.domain;

import lombok.Value;

@Value(staticConstructor = "from")
public class TimeDay {

    Hours hours;
    Minutes minutes;
    Seconds seconds;
    Integer totalHour;

    private TimeDay(Hours hours, Minutes minutes,  Seconds seconds, Integer totalHour){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.totalHour = totalHour;
    }

}
