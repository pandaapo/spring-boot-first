package com.panda.springboot.springbootfirst.firstDemo;

import org.springframework.stereotype.Service;

/**
 * 希望这个类被spring托管
 * 1、<bean name="" class="com.panda.springboot.firstDemo.DemoClass"/>
 * 2、java config
 * 3、autoconfiguration
 */
@Service
public class DemoClass {
    public void say() {
        System.out.println("Say: Hello Panda");
    }
}
