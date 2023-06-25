package com.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.jpa.controller.UserController;



//import com.jpa.dao.UserRepo;
//import com.jpa.entities.User;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(value="com.jpa.dao")
@ComponentScan(basePackageClasses=UserController.class)
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootjpaexampleApplication.class, args);
	}

}
