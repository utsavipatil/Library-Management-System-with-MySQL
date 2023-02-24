package com.LMSbackend.LMSBackendApplication.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AuthorResponseDto {
    private int id;
    private String name;
    private int age;
    private String email;
    private String country;

//    private List<BookResponseDto> booksWritten;
}
