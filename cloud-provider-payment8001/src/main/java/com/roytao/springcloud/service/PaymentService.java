package com.roytao.springcloud.service;

import com.roytao.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author RoyTao
 * @since 2020/6/28 17:12
 */
public interface PaymentService {
    int add(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
