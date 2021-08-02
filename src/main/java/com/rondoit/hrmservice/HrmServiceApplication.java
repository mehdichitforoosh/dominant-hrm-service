package com.rondoit.hrmservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(Source.class)
public class HrmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmServiceApplication.class, args);
	}

}
