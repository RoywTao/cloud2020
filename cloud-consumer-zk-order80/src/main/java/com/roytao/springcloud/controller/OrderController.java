package com.roytao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author RoyTao
 * @since 2020/7/2 15:51
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    // 集群负载均衡版本 只需声明服务名称 通过负载均衡可以去轮询请求已配置的服务实例
    public static final String INVOKE_URL = "http://cloud-payment-service";

    @GetMapping("consumer/payment/zk")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);
    }

}
