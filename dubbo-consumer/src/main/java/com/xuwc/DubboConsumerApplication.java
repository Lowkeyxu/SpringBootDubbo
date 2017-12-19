package com.xuwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbox-consumer.xml")
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DubboConsumerApplication {

	public static void main(String[] args) {
		System.out.println("=======================消费者服务启动中====================");
		SpringApplication.run(DubboConsumerApplication.class, args);
		System.out.println("=======================消费者服务启动完成====================");
	}
}
