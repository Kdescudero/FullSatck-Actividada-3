package com.Actvidad_2.Actividad_2.configuration;

import com.Actvidad_2.Actividad_2.time.domain.Hours;
import com.Actvidad_2.Actividad_2.time.domain.Minutes;
import com.Actvidad_2.Actividad_2.time.domain.Seconds;
import com.Actvidad_2.Actividad_2.time.serialization.ValueAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson(){
        return new GsonBuilder()
                .registerTypeAdapter(Hours.class, new ValueAdapter<>(Hours::of))
                .registerTypeAdapter(Minutes.class, new ValueAdapter<>(Minutes::of))
                .registerTypeAdapter(Seconds.class, new ValueAdapter<>(Seconds::of))
                .create();
    }

}
