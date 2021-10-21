package com.photoapp.userms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoappUsermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoappUsermsApplication.class, args);
	}

}
