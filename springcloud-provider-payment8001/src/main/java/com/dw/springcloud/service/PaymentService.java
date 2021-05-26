package com.dw.springcloud.service;

import com.dw.springcloud.dao.PaymentDao;
import com.dw.springcloud.entities.Payment;
import com.dw.springcloud.entities.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dw
 * @date 2021/5/19 22:16
 * @Description
 */
@Service
public class PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int  insertPayment(String serial){
        Payment payment=new Payment(null,serial);
        return   this.paymentDao.createParment(payment);
    }

    public Payment  queryPaymentById(Long id){
       return this.paymentDao.queryPaymentById(id);
    }
}
