package com.roytao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author RoyTao
 * @since 2020/7/2 15:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZkOrderApplication.class,args);
    }
}
