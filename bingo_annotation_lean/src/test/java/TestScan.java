import com.bingo.bean.Persion;
import com.bingo.config.Config;
import com.bingo.config.Config02;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestScan {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        String[] beanDefinition = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinition) {
            System.out.println(name);
        }

    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config02.class);
        /*Object persion = applicationContext.getBean("persion");
        System.out.println(persion);
        Object persion1 = applicationContext.getBean("persion");
        System.out.println(persion1);
        System.out.println(persion == persion1);*/
    }

    @Test
    public void test03(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config02.class);
        String[] name = applicationContext.getBeanNamesForType(Persion.class);
        for (String n:name){
            System.out.println(n);
        }
        /*Object persion = applicationContext.getBean("persion");
        System.out.println(persion);
        Object persion1 = applicationContext.getBean("persion");
        System.out.println(persion1);
        System.out.println(persion == persion1);*/
    }

}
