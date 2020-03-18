package com.outspace.miroservices.netlixeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetlixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetlixEurekaNamingServerApplication.class, args);
	}

}
