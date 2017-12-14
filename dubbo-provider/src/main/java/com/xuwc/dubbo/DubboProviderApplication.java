package com.xuwc.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbox-provider.xml")
@SpringBootApplication
public class DubboProviderApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DubboProviderApplication.class);
	}

	public static void main(String[] args) {
		System.out.println("=======================服务启动中====================");
		SpringApplication.run(DubboProviderApplication.class, args);
		System.out.println("=======================服务启动完成====================");
	}
}
