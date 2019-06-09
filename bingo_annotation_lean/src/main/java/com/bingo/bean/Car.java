package com.bingo.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }
    public void init(){
        System.out.println("Car 初始化了。。。");
    }

    public void destory(){
        System.out.println("Car bean 销毁了");
    }
}
