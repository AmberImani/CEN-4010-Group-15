package com.bookstore.GeekText.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"controller"})
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@EnableJpaRepositories("com.bookstore.GeekText.repository.MySqlRepository")
//@ComponentScan({"com.bookstore.GeekText.controller.BookRest","com.bookstore.GeekText.service.BookService"})
public class GeekTextApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeekTextApplication.class, args);
    }

}