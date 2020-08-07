package com.equester.capstoneproject;

import com.equester.capstoneproject.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class CapstoneprojectApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8090);
		SpringApplication.run(CapstoneprojectApplication.class, args);
	}

}
