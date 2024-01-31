package com.tizi.fastdelidatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.tizi.fastdelidatabase")
@SpringBootApplication
public class FastdelidatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastdelidatabaseApplication.class, args);
    }

}
