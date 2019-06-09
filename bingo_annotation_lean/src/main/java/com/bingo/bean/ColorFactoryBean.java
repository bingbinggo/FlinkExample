package com.bingo.bean;

import org.springframework.beans.factory.FactoryBean;
//����һ��Spring�����FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {

    //����һ��Color��������������ӵ�������
    @Override
    public Color getObject() throws Exception {
        System.out.println("ʹ���˹���bean����color");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }


    //�Ƿ��ǵ�����
    //true�����bean�ǵ�ʵ�����������б���һ��
    //false����ʵ����ÿ�λ�ȡ���ᴴ��һ���µ�bean��
    @Override
    public boolean isSingleton() {
        return false;
    }
}
