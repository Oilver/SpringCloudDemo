package com.deng.springcloudserver3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudServer3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServer3Application.class, args);
	}
}
