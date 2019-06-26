package com.tedu.sp03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Sp02UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp02UserserviceApplication.class, args);
	}

}
