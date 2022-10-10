package com.example.TongGiaHuy_420300154901.Nhom1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages= "com.*")
@Configuration
@ComponentScan("com.example.TongGiaHuy.420300154901.Nhom1")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
