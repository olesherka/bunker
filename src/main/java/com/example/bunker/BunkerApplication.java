package com.example.bunker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@Slf4j
public class BunkerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BunkerApplication.class, args);

    }

}
