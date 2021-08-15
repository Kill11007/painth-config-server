package com.knackitsultions.centralizedconfigurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class CentralizedConfigurationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralizedConfigurationServiceApplication.class, args);
	}

}
