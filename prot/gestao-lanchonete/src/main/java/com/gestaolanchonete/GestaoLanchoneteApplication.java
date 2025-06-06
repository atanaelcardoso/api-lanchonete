package com.gestaolanchonete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.gestaolanchonete.model") // ← ISSO é importante
public class GestaoLanchoneteApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestaoLanchoneteApplication.class, args);
    }
}
