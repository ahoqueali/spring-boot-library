package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MyBeanImpl implements MyBean{

    @Override
    public void sayHello() {
        System.out.println("myBean");
    }
}
