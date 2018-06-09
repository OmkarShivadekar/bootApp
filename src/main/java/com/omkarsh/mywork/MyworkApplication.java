package com.omkarsh.mywork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com"},exclude = {JpaRepositoriesAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class MyworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyworkApplication.class, args);
	}
}
