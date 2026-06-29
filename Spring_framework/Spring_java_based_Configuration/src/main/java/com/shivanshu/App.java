package com.shivanshu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Desktop dt = (Desktop) context.getBean("desktop");
        dt.compile();

        Desktop dt1 = (Desktop) context.getBean("desktop");
        dt1.compile();
    }
}
