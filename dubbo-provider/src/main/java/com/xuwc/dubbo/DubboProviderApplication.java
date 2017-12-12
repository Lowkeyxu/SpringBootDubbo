package com.xuwc.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbox-provider.xml")
@SpringBootApplication
public class DubboProviderApplication {

	public static void main(String[] args) {
		System.out.println("=======================服务启动中====================");
		SpringApplication.run(DubboProviderApplication.class, args);
		System.out.println("=======================服务启动完成====================");
	}
}
