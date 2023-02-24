package com.LMSbackend.LMSBackendApplication.Controllers;

import com.LMSbackend.LMSBackendApplication.Models.Author;
import com.LMSbackend.LMSBackendApplication.RequestDto.AuthorRequestDTO;
import com.LMSbackend.LMSBackendApplication.ResponseDto.AuthorResponseDto;
import com.LMSbackend.LMSBackendApplication.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/create")
    public String createAuthor(@RequestBody()AuthorRequestDTO authorRequestDTO){
        return authorService.createAuthor(authorRequestDTO);
    }
    @GetMapping("/findBy/{name}")
    public List<AuthorResponseDto> findByName(@PathVariable("name") String name){
        return authorService.findAuthorByName(name);
    }
}
