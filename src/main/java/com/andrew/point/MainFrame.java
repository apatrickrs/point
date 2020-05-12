package com.andrew.point;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MainFrame {

	public static void main(String[] args) {
		SpringApplication.run(MainFrame.class, args);
	}

}
