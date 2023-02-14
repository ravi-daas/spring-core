package property_Injection;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("property_Injection.xml");

        property_Injection obj1 =  (property_Injection) context.getBean("firstbean");

        System.out.println(obj1);

        property_Injection obj2 =  (property_Injection) context.getBean("secondbean");

        System.out.println(obj2);

        // closes the ApplicationContext reference
        ((ClassPathXmlApplicationContext) context).close();
    }
}