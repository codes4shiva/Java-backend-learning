package com.shivanshu;

import org.springframework.context.ApplicationContext;
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
        // if the scope is singleton in bean then this Application context line will automatically object
        Alien obj1 = (Alien)context.getBean("alien");
        obj1.code();
        obj1.age = 19;
        System.out.println(obj1.age);
        Alien obj2 = (Alien)context.getBean("alien");
        System.out.println(obj2.age);
    }
}
