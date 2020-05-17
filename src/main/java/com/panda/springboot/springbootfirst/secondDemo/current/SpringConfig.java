package com.panda.springboot.springbootfirst.secondDemo.current;

import com.panda.springboot.springbootfirst.secondDemo.other.OtherConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(OtherConfig.class)
@Configuration
public class SpringConfig {

    @Bean
    public DefaultBean defaultBean() {
        return new DefaultBean();
    }
}
