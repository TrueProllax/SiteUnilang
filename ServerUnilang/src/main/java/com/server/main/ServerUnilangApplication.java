package com.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ContextConfiguration
@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.server")
@EntityScan(basePackages = "com.server.database.entity")
@EnableJpaRepositories(basePackages = "com.server.repository")
public class ServerUnilangApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerUnilangApplication.class, args);
    }

}
