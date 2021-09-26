package com.example.springreddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringredditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringredditApplication.class, args);
	}

}
