package com.panda.springboot.springbootfirst.secondDemo.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {

    @Bean
    public OtherBean otherBean() {
        return new OtherBean();
    }
}
