package com.hayeum.backserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BackServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackServerApplication.class, args);
		log.info("********** Start Back Server **********");
	}

}
