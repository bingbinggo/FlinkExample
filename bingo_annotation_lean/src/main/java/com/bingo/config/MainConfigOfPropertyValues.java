package com.bingo.config;

import com.bingo.bean.Persion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//ʹ��@PropertySource��ȡ�ⲿ�����ļ��е�k/v���浽���еĻ���������;�������ⲿ�������ļ��Ժ�ʹ��${}ȡ�������ļ���ֵ
@PropertySource(value={"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValues  {

    @Bean
    public Persion persion(){
        return new Persion();
    }
}
