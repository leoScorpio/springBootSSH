package com.beyong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.beyong.mapper")
public class SshbasespringbootApplication {

	public static void main(String[] args) {

		SpringApplication.run(SshbasespringbootApplication.class, args);
	}
}
