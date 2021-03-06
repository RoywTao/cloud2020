package com.roytao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author RoyTao
 * @since 2020/7/2 16:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication4 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication4.class,args);
    }
}
