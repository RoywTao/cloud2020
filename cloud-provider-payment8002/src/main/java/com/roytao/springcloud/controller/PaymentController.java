package com.roytao.springcloud.controller;

import com.roytao.springcloud.entity.CommonResult;
import com.roytao.springcloud.entity.Payment;
import com.roytao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author RoyTao
 * @since 2020/6/28 17:34
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @PostMapping(value = "/payment/add")
    public CommonResult add(@RequestBody Payment payment){
        int result = paymentService.add(payment);
        log.info("********插入结果："+result);
        if(result > 0){
            return new CommonResult(200," insert success server port:"+serverPort,result);
        }else{
            return new CommonResult(444," insert failure server port:"+serverPort);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("********查询结果："+payment);
        if(payment != null){
            return new CommonResult(200,"query success server port:"+serverPort,payment);
        }else{
            return new CommonResult(444,"query failure, server port:"+serverPort+"query id:"+id);
        }
    }

}
