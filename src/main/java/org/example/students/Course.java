package org.example.students;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@ToString
public class Course {
    private String courseName;

@Autowired
    private List<Student> studentsList;


  /*  public Course(List<Student> studentsList) {
        this.studentsList = studentsList;
    }*/

    void printStudentsList() {
        studentsList.stream().
                map(e -> "Студент:" + e.getName() + " " + e.getSurname())
                .forEach(System.out::println);
    }
}
