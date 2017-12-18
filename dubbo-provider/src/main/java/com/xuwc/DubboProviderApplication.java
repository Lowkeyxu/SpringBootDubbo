package com.xuwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbox-provider.xml")
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DubboProviderApplication{

	private static volatile boolean running = true;

	public static void main(String[] args) {
		System.out.println("=======================服务启动中====================");
		SpringApplication.run(DubboProviderApplication.class, args);
		System.out.println("=======================服务启动完成====================");
		synchronized (DubboProviderApplication.class) {
			while (running) {
				try {
					DubboProviderApplication.class.wait();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}
	}
}
