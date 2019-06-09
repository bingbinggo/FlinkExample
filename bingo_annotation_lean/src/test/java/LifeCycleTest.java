import com.bingo.bean.Car;
import com.bingo.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    @Test
    public void test01(){
        /*Car bean = applicationContext.getBean(Car.class);
        System.out.println(bean);
        applicationContext.close();*/
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

        printBean(applicationContext);
        applicationContext.close();
    }
    private void printBean(AnnotationConfigApplicationContext applicationContext){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
    }

}
