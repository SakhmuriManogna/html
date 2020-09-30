package com.myboot.boot.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApiApplication {

public static void main(String[] args) {
SpringApplication.run(BootApiApplication.class, args);

System.out.println("Service is up ");
}

}