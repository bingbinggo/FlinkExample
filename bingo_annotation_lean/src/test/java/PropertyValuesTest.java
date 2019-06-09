import com.bingo.bean.Persion;
import com.bingo.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

public class PropertyValuesTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }

        System.out.println("=========================");
        Persion persion = (Persion)applicationContext.getBean("persion");
        System.out.println(persion);

        System.out.println("===========获取运行环境中的properties==============");
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String propertySources = environment.getProperty("persion.nickNmae");
        System.out.println(propertySources);

        applicationContext.close();

    }
}
