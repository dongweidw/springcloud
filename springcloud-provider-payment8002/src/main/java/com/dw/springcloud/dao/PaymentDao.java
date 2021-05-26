package com.dw.springcloud.dao;

import com.dw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author dw
 * @date 2021/5/19 21:33
 * @Description
 */
@Mapper
public interface PaymentDao {

    int createParment(Payment payment);

    Payment queryPaymentById(@Param("id") Long id);
}
