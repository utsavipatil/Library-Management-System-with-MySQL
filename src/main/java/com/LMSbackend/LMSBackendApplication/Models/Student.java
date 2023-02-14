package com.LMSbackend.LMSBackendApplication.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(name = "school_email", unique = true, nullable = false) //this column will have always unique email id
    private String email;
    private int age;
    @Column(columnDefinition = "varchar(255) default 'India'")
    private String country;

    //mappedBy = what variable name from child you want to connect
    //cascade = ALL columns we need to cascade
    @OneToOne(mappedBy = "studentInfo", cascade = CascadeType.ALL)
    private Card card;

    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    public Student(String name, String email, int age, String country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.country = country;
    }
}
