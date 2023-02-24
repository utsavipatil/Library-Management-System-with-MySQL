package com.LMSbackend.LMSBackendApplication.Converters;

import com.LMSbackend.LMSBackendApplication.Models.Author;
import com.LMSbackend.LMSBackendApplication.RequestDto.AuthorRequestDTO;
import com.LMSbackend.LMSBackendApplication.ResponseDto.AuthorResponseDto;

import java.util.ArrayList;
import java.util.List;

public class AuthorConverter {
    public static Author convertDtoToEntity(AuthorRequestDTO authorRequestDTO){
        Author author = Author.builder()
                        .name(authorRequestDTO.getName())
                        .country(authorRequestDTO.getCountry())
                        .age(authorRequestDTO.getAge())
                        .email(authorRequestDTO.getEmail())
                        .build();
        return author;
    }
    public static List<AuthorResponseDto> convertEntityToDto(List<Author> authors){
        List<AuthorResponseDto> authorResponseDtoList = new ArrayList<>();
        for(Author author :authors){
            AuthorResponseDto authorResponseDto = AuthorResponseDto.builder().id(author.getId()).name(author.getName()).age(author.getAge()).
                                                country(author.getCountry()).email(author.getEmail()).build();
            //Try - How to add BookresponceDto

            authorResponseDtoList.add(authorResponseDto);
        }
        return authorResponseDtoList;
    }
}
