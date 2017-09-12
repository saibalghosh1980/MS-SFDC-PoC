package com.cts.ms.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsLocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLocationApplication.class, args);
	}
}
