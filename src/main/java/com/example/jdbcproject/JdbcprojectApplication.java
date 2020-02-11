package com.example.jdbcproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.jdbcproject.mapper")		//扫描mapper包
public class JdbcprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcprojectApplication.class, args);
	}

}
