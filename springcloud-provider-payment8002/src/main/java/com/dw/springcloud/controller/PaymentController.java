package com.dw.springcloud.controller;

import com.dw.springcloud.entities.Payment;
import com.dw.springcloud.entities.ResultObject;
import com.dw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author dw
 * @date 2021/5/19 22:23
 * @Description
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private  String   seriveport;

    @PostMapping(value = "/payment/insertPayment")
    public  ResultObject  insertPayment(@RequestBody Payment payment){
        int result =this.paymentService.insertPayment(payment.getSerial());
        log.info("添加结果",result);
        if (result>0) return new ResultObject(200,"添加成功  port:  "+seriveport,result);
        else  return new ResultObject(500,"添加失败",result);
    }

    @GetMapping("/payment/queryPaymentById/{id}")
    public ResultObject queryPaymentById(@PathVariable(name = "id") Long id){
        Payment payment=this.paymentService.queryPaymentById(id);
        log.info("查询结果",payment);
        return new ResultObject(200,"返回数据  port:  "+seriveport,payment);
    }
}
