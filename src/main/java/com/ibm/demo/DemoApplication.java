package com.ibm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        greeeting("How are you?");
        greeeting("I_am_fine");
    }

    private static void greeeting(String message) {
        System.out.println(message);
    }
}
