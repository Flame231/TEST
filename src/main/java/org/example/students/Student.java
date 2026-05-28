package org.example.students;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
@Getter
@Setter
@ToString
@Component
public class Student {

    private String name;
    private String Surname;
    private String course;
    private double rating;

  /*  public Student(String name, String surname, String course, double rating) {
        this.name = name;
        Surname = surname;
        this.course = course;
        this.rating = rating;
    }*/

    private List<String> objectsList;
}
