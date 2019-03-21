package com.cloud.demo.consume3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients("com.cloud.demo.consume3")
@EnableEurekaClient
public class Consume3Application {

    public static void main(String[] args) {
        SpringApplication.run(Consume3Application.class, args);
    }

}
