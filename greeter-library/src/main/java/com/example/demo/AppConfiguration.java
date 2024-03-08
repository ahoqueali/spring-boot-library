package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public HelloService createMyLibraryInstance() {
        return new HelloService();
    }
}
