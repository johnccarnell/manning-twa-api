package com.twa.flights.api.provider.beta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = { "com.twa.flights.api" })
public class App implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
