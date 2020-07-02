package com.roytao.springcloud.controller;

import com.roytao.springcloud.entity.CommonResult;
import com.roytao.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author RoyTao
 * @since 2020/6/29 10:43
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;
    // 单机版本
    // public static final String PAYMENT_URL = "http://localhost:8001";

    // 集群负载均衡版本 只需声明服务名称 通过负载均衡可以去轮询请求已配置的服务实例
    public static final String PAYMENT_URL = "http://cloud-payment-service";

    @GetMapping("/consumer/payment/add")
    public CommonResult<Payment> add(Payment payment){
        log.info("请求到consumer端 url:"+"/consumer/payment/add");
        return restTemplate.postForObject(PAYMENT_URL+"/payment/add",payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        log.info("请求到consumer端 url:"+"/consumer/payment/get/{id}");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

}
