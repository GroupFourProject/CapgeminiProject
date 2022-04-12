package com.example.SeatType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.model")
@EnableJpaRepositories({"com.dao"})
public class SeatTypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeatTypeApplication.class, args);
	}

}
