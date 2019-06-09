import com.bingo.aop.MathCalculator;
import com.bingo.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        MathCalculator bean = applicationContext.getBean(MathCalculator.class);


        bean.div(1,0);

        applicationContext.close();
        /*String[] names = applicationContext.getBeanDefinitionNames();

        for (String name:names){
            System.out.println(name);
        }*/
    }
}
