package com.dw.springcloud.controller;

import com.dw.springcloud.entities.Payment;
import com.dw.springcloud.entities.ResultObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dw
 * @date 2021/5/20 21:39
 * @Description
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private RestTemplate restTemplate;

//    private final  String   PAYMENT_URL="http://localhost:8001";

    private final  String   PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @PostMapping("/consumer/payment/insertPayment")
    public ResultObject<Payment>  insertPayment(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/insertPayment",payment,ResultObject.class);
    }

    @GetMapping("/consumer/payment/queryPaymentById/{id}")
    public   ResultObject  queryPaymentById(@PathVariable(name = "id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/queryPaymentById/"+id,ResultObject.class);
    }
}
