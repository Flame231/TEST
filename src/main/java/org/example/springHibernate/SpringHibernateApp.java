package org.example.springHibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig1.xml");
    }
}
