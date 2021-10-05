package com.example1.Spring_Project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProject1Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringProject1Application.class, args);
		Travel travel = applicationContext.getBean(Travel.class);
		travel.travel_Info(1000);
		//		Travel obj = new Travel(new Bike());
//		obj.travel_Info(1000);

	}

}
