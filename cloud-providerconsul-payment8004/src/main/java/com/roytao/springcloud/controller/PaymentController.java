package com.roytao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author RoyTao
 * @since 2020/7/2 16:58
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String discovery(){
        return "spring cloud with consul server port:"+serverPort+"\t" + UUID.randomUUID();
    }

}
