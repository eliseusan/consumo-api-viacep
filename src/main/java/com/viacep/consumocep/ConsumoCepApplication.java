package com.viacep.consumocep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients

public class ConsumoCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoCepApplication.class, args);
	}

}
