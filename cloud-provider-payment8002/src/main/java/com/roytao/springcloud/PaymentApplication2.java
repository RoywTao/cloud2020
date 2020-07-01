package com.roytao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author RoyTao
 * @since 2020/7/1 16:05
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication2.class,args);
    }
}
