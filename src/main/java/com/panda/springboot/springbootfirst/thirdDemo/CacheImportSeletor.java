package com.panda.springboot.springbootfirst.thirdDemo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class CacheImportSeletor implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String, Object> attributes = annotationMetadata.getAnnotationAttributes(EnableDefineService.class.getName());
        //这里可以返回需要动态注入bean的beanName
        // TODO
        // 简化处理：返回固定的beanName
        return new String[]{CacheService.class.getName()};
    }
}
