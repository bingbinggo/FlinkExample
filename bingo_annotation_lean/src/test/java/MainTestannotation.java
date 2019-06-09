import com.bingo.bean.Persion;
import com.bingo.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestannotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        //Object bean = applicationContext.getBean("persion");
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Persion.class);//查看该实体类在容器中的名称
        for (String name:beanNamesForType){

            System.out.println(name);
        }
    }
}
