package com.Actvidad_2.Actividad_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class Actividad2Application {

	public static void main(String[] args) {
		SpringApplication.run(Actividad2Application.class, args);
	}

}
