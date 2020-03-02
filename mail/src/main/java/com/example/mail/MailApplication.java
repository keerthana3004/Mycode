package com.example.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MailApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(MailApplication.class, args);
    }

}
