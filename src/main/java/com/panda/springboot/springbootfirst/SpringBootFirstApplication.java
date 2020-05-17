package com.panda.springboot.springbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(SpringBootFirstApplication.class, args);
        String[] beanDefs = ca.getBeanDefinitionNames();
        for (String str : beanDefs) {
            System.out.println(str);
        }

    }

}
