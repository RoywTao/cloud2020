package com.roytao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author RoyTao
 * @since 2020/7/2 17:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderApplication.class,args);
    }
}
