package com.bingo.bean;

import org.springframework.beans.factory.annotation.Value;

public class Persion {

    //ʹ��@Value��ֵ��
    //1��������ֵ
    //2������дSpEL�� #{}
    //3������д${}��ȡ�������ļ���properties���е�ֵ�������л������������ֵ��
    @Value("����")
    private String name;
    @Value("#{20-9}")
    private Integer age;
    @Value("${persion.nickNmae}")
    private String nickName;



    public Persion() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Persion(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
