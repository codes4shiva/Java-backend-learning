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

      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       Alien a1 = context.getBean("alien",Alien.class);
       Alien a2 = context.getBean("alien",Alien.class);
       a1.setAge(21);
       System.out.println(a1.getAge());
       System.out.println(a2.getAge());
    }
}
