package com.bingo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car02 implements InitializingBean, DisposableBean {
    public Car02() {
        System.out.println("car02 constructor...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("car02 destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat02...afterPropertiesSet...");
    }
}
