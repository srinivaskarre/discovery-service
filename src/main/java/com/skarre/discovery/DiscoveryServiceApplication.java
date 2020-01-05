package com.skarre.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class DiscoveryServiceApplication {

	public static void main(String[] args) {
		log.info("Before Start");
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}

}
