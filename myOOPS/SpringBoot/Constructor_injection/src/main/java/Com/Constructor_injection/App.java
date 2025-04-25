package Com.Constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml"); 
        System.out.println(context.getBean(Facultyy.class)  );
    }
}
