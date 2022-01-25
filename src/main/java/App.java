import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld firstHuman = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondHuman = (HelloWorld) applicationContext.getBean("helloworld");

        Cat firstCat = applicationContext.getBean(Cat.class);
        Cat secondCat = applicationContext.getBean(Cat.class);

        System.out.println(firstHuman.getMessage() + " said firstHuman");
        System.out.println(secondHuman.getMessage() + " said secondHuman");
        System.out.println(firstCat.getMessage() + " said firstCat");
        System.out.println(secondCat.getMessage() + " said secondCat");

        System.out.println(firstHuman.equals(secondHuman));
        System.out.println(firstCat.equals(secondCat));
    }
}