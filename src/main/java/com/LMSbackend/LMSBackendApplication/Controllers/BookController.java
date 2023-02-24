package com.LMSbackend.LMSBackendApplication.Controllers;

import com.LMSbackend.LMSBackendApplication.RequestDto.BookRequestDTO;
import com.LMSbackend.LMSBackendApplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/createBook")
    public String createBook(@RequestBody()BookRequestDTO bookRequestDTO){
        return bookService.createBook(bookRequestDTO);
    }
}
