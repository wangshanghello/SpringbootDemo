
package com.itmayiedu.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = "com.itmayiedu")
@MapperScan(basePackages = "com.itmayiedu.mapper")

public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
