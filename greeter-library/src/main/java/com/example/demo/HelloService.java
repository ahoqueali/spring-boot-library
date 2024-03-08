package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    @Autowired
    private MyBean myBean;
    public void sayHello(){
        myBean.sayHello();
    }
}
