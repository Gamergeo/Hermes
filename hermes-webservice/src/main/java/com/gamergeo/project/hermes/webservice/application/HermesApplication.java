package com.gamergeo.project.hermes.webservice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.gamergeo.project.hermes")
@EntityScan("com.gamergeo.project.hermes.model")
@EnableJpaRepositories("com.gamergeo.project.hermes.persistence") 
public class HermesApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(HermesApplication.class, args);
  }

}