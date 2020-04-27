package com.Actvidad_2.Actividad_2.time.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class DayTime {
    Hours hours;
    Minutes minutes;
    Seconds seconds;
}
