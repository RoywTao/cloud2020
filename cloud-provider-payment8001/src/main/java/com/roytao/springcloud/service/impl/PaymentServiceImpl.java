package com.roytao.springcloud.service.impl;

import com.roytao.springcloud.dao.PaymentDao;
import com.roytao.springcloud.service.PaymentService;
import com.roytao.springcloud.entity.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author RoyTao
 * @since 2020/6/28 17:30
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
