package com.panda.springboot.springbootfirst.fourthDemo;

import com.panda.core.PandaCore;
import com.panda.springboot.springbootfirst.thirdDemo.EnableDemoMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FourthMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(EnableDemoMain.class, args);
//        for (String beanDefinitionName : ca.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }

        System.out.println(ca.getBean(PandaCore.class).study());
    }
}
