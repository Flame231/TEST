package org.example.springHibernate;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"employees"})
@ToString(exclude = {"employees"})
@Builder
@AllArgsConstructor
@Entity

public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long departmentId;
    private String departmentName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Employee> employees = new HashSet<>(0);

    public Department(String name) {
        this.departmentName = name;
    }
}
