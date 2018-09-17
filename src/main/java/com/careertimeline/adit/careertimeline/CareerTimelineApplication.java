package com.careertimeline.adit.careertimeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.careertimeline.adit.controller")
public class CareerTimelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareerTimelineApplication.class, args);
	}
}
