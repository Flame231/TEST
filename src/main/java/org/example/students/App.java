package org.example.students;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example.students")
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Course course = context.getBean(Course.class);
        course.printStudentsList();
    }
}
