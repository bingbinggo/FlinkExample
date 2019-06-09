import com.bingo.bean.Boss;
import com.bingo.bean.Car;
import com.bingo.bean.Color;
import com.bingo.config.MainConfigOfAutowired;

import com.bingo.dao.BookDao;
import com.bingo.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Autowired {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }

        System.out.println("=========标注在属性上========");
        BookService bean = applicationContext.getBean(BookService.class);
        System.out.println(bean);


        System.out.println("===============");
        BookDao bean1 = applicationContext.getBean(BookDao.class);
        System.out.println(bean1);

        System.out.println("=========标注在方法上========");
        Boss bean2 = applicationContext.getBean(Boss.class);
        System.out.println(bean2);
        System.out.println("==========================");
        Car bean3 = applicationContext.getBean(Car.class);
        System.out.println(bean3);

        System.out.println("===============标注在方法参数上==================");
        Color bean4 = applicationContext.getBean(Color.class);
        System.out.println(bean4);

        System.out.println("================自定义ioc 组件==========================");
        System.out.println(applicationContext);
        applicationContext.close();
    }
}
