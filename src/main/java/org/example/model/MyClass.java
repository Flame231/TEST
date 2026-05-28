package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Builder
@Data
@Entity
@AllArgsConstructor
public class MyClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;
    @Column
    private String type;

    @CreationTimestamp
    Timestamp createDateTime;
    @UpdateTimestamp
    Timestamp updateDateTime;

    public MyClass() {

    }
}
