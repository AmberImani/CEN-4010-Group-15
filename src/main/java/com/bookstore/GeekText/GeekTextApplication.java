package com.bookstore.GeekText;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
//@ComponentScan({"com.bookstore.GeekText.controller.BookRest","com.bookstore.GeekText.service.BookService"})
public class GeekTextApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeekTextApplication.class, args);
    }

}