package com.example.htmldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import nz.net.ultraq.thymeleaf.LayoutDialect;

@SpringBootApplication
@EnableCaching
@EnableAsync
@ConfigurationPropertiesScan
public class HtmldemoApplication {

    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }

    public static void main(String[] args) {
        SpringApplication.run(HtmldemoApplication.class, args);
    }

}
