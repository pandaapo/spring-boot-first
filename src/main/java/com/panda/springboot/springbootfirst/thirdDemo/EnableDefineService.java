package com.panda.springboot.springbootfirst.thirdDemo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 模拟@EnableAutoConfiguration注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CacheImportSeletor.class, LoggerDefinitionRegistrar.class})
public @interface EnableDefineService {

    //配置一些方法
    Class<?>[] exclude() default {};
}
