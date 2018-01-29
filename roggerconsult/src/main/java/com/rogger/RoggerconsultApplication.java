package com.rogger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rogger.mappers")
public class RoggerconsultApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoggerconsultApplication.class, args);
	}
}
