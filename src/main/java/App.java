import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHellWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(beanHellWorld1.getMessage());

        HelloWorld beanHellWorld2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(beanHellWorld1 == beanHellWorld2);


        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1 == beanCat2);
    }
}