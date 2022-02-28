package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivity2App {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        GolfCoach theCoach = context.getBean("myGolfCoach", GolfCoach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // call our new methods to get the literal values
        System.out.println(theCoach);
        System.out.println(theCoach);


        // close the context
        context.close();
    }
}
