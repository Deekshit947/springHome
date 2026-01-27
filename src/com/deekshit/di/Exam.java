package com.deekshit.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/deekshit/di/beans.xml");
        Student deekshit = context.getBean("student", Student.class);
        deekshit.displayStudentInfo();
    }
}
