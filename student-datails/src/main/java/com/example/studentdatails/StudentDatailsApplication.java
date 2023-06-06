package com.example.studentdatails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StudentDatailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDatailsApplication.class, args);
	}

}
