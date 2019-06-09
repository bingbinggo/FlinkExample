package com.bingo.conditional;

import com.bingo.bean.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * AnnotationMetadata：当前类的注解信息
     * BeanDefinitionRegistry:BeanDefinition注册类；
     * 		把所有需要添加到容器中的bean；调用
     * 		BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean definitionColor = registry.containsBeanDefinition("com.bingo.bean.Color");
        boolean definitionBlue = registry.containsBeanDefinition("com.bingo.bean.Blue");

        if (definitionBlue && definitionColor){
            RootBeanDefinition definitionRainbow = new RootBeanDefinition(Rainbow.class);
            registry.registerBeanDefinition("rainbow",definitionRainbow);
        }
    }
}
