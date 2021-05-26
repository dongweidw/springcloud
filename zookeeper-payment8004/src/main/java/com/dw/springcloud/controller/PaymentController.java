package com.dw.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author dw
 * @date 2021/5/24 17:44
 * @Description
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String  serverport;

    @GetMapping("/payment/getzookeeperadrss")
    public  String  getzookeeperadrss(){
        return serverport+"uuid: "+ UUID.randomUUID().toString();
    }
}
