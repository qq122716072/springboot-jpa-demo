package com.bjnangle.webservice.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication(scanBasePackages="com.bjnangle.webservice")
@EntityScan("com.bjnangle.webservice.model")
@EnableJpaRepositories(basePackages = "com.bjnangle.webservice.dao")
@EnableJpaAuditing
public class Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);

        new StartWebservices().startWebservices();
    }




}
