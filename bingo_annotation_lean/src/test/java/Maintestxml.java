import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maintestxml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object bean = applicationContext.getBean("persion");
        System.out.print(bean);
    }
}
