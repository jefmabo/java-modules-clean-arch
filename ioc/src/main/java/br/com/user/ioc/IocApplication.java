package br.com.user.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EntityScan(basePackages = {"br.com.user.repository.entity"})
@EnableJpaRepositories(basePackages = {"br.com.user.repository"})
@ComponentScan(basePackages = {"br.com.user.controller", "br.com.user.usecases"})
public class IocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);
	}

}
