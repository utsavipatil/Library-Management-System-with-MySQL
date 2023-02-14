package com.LMSbackend.LMSBackendApplication.RequestDto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequestDTO {
    private int age;
    @Column(nullable = false)
    private String name;
    @Column(columnDefinition = "varchar(255) default 'India'")
    private String country;
    @Column(name = "school_email", unique = true, nullable = false) //this column will have always unique email id
    private String email;
}
