package com.bingo.conditional;

import com.bingo.bean.Blue;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {


    //����ֵ�����ǵ����뵽�����е����ȫ����
    //AnnotationMetadata:��ǰ��ע@Importע����������ע����Ϣ
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //String className = importingClassMetadata.getClassName(Blue.class);
        return new String[]{"com.bingo.bean.Blue","com.bingo.bean.Yellow"};
    }
}
