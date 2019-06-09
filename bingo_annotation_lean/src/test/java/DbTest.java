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
        //1������һ��applicationContext
        //2��������Ҫ����Ļ���
        //applicationContext.getEnvironment().setActiveProfiles("dev");
        //3��ע����������
        //applicationContext.register(MainConfigOfProfile.class);
        //4������ˢ������
        //applicationContext.refresh();

        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names){

            System.out.println(name);
        }

        applicationContext.close();
    }
}
