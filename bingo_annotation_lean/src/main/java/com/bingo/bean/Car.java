package com.bingo.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }
    public void init(){
        System.out.println("Car ��ʼ���ˡ�����");
    }

    public void destory(){
        System.out.println("Car bean ������");
    }
}
