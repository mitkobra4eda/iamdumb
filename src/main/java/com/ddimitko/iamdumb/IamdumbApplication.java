package com.ddimitko.iamdumb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class IamdumbApplication {

    public static void main(String[] args) {
        SpringApplication.run(IamdumbApplication.class, args);
    }

}
