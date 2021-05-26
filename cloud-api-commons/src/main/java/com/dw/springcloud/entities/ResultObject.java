package com.dw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author dw
 * @date 2021/5/19 20:10
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObject<T> implements Serializable {
    private Integer  code;
    private String   message;
    private T  data;

    public  ResultObject(Integer code,String message){
        this(code,message,null);
    }
}
