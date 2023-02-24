package com.LMSbackend.LMSBackendApplication.Service;

import com.LMSbackend.LMSBackendApplication.Converters.AuthorConverter;
import com.LMSbackend.LMSBackendApplication.Models.Author;
import com.LMSbackend.LMSBackendApplication.Repository.AuthorRepository;
import com.LMSbackend.LMSBackendApplication.RequestDto.AuthorRequestDTO;
import com.LMSbackend.LMSBackendApplication.ResponseDto.AuthorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public String createAuthor(AuthorRequestDTO authorRequestDTO){
        try{
            Author author = AuthorConverter.convertDtoToEntity(authorRequestDTO);
            authorRepository.save(author);
        }catch (Exception e){
            log.info("createAuthor has caused an error");
            return "createAuthor didn't work";
        }
        return "Author created successfully";
    }
    public List<AuthorResponseDto> findAuthorByName(String name){
        List<Author> authors = authorRepository.findByName(name);
        List<AuthorResponseDto> authorResponseDtos = AuthorConverter.convertEntityToDto(authors);
        return authorResponseDtos;
    }
}
