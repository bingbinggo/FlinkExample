import com.bingo.config.Config02;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.midi.Soundbank;

public class IocTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config02.class);

    @Test
    public void testImport(){
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        Object bean3 = applicationContext.getBean("colorFactoryBean");
        Class<?> aClass = bean2.getClass();
        System.out.println(aClass);
        System.out.println(bean3.getClass());
        //printBean(applicationContext);

    }

    private void printBean(AnnotationConfigApplicationContext applicationContext){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
    }
}
