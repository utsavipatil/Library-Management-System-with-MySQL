package com.LMSbackend.LMSBackendApplication.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AuthorRequestDTO {
    private String name;
    private int age;
    @Column(unique = true)
    private String email;
    private String country;
}
