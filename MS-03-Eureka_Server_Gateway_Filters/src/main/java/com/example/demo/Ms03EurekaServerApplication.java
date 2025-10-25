package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableEurekaServer
public class Ms03EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms03EurekaServerApplication.class, args);
	}

}
