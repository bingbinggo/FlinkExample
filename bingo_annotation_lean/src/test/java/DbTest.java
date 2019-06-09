import com.bingo.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DbTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.getEnvironment().addActiveProfile("test");
        applicationContext.register(MainConfigOfProfile.class);

        applicationContext.refresh();
        //1、创建一个applicationContext
        //2、设置需要激活的环境
        //applicationContext.getEnvironment().setActiveProfiles("dev");
        //3、注册主配置类
        //applicationContext.register(MainConfigOfProfile.class);
        //4、启动刷新容器
        //applicationContext.refresh();

        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names){

            System.out.println(name);
        }

        applicationContext.close();
    }
}
