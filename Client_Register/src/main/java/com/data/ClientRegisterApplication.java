package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRegisterApplication.class, args);
	}

}
