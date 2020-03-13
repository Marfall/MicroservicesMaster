package com.outspace.microservices.currencyexchangeservice;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.sql.SQLException;

@SpringBootApplication
public class CurrencyExchangeServiceApplication {


		@PostConstruct
		@Bean(initMethod = "initData")
		public DataInitializer init() {
			return new DataInitializer();
		}

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server h2Server() throws SQLException {
		return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092");
	}
}
