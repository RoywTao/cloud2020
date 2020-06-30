package com.roytao.springcloud.dao;

import com.roytao.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author RoyTao
 * @since 2020/6/28 16:48
 */
@Mapper
public interface PaymentDao {

    int add(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
