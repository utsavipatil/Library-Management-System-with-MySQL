package com.LMSbackend.LMSBackendApplication.Service;

import com.LMSbackend.LMSBackendApplication.Converters.BookConverter;
import com.LMSbackend.LMSBackendApplication.Models.Author;
import com.LMSbackend.LMSBackendApplication.Models.Book;
import com.LMSbackend.LMSBackendApplication.Repository.AuthorRepository;
import com.LMSbackend.LMSBackendApplication.Repository.BookRepository;
import com.LMSbackend.LMSBackendApplication.RequestDto.BookRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

    public String createBook(BookRequestDTO bookRequestDTO){
        Book book = BookConverter.convertDtoToEntity(bookRequestDTO);

        //Need to set AuthorEntity
        int authorId = bookRequestDTO.getAuthorId();
        Author author = authorRepository.findById(authorId).get(); //Get Author Entity
        book.setAuthor(author); //Set Author entity

        //Book List update
        List<Book> currentBookList = author.getBooksWritten();
        currentBookList.add(book);
        author.setBooksWritten(currentBookList);

        //Save Author & Book
        authorRepository.save(author);
//        bookRepository.save(book); No need because Author is parent --> Book so for bookRepository will also got save automatically

        return "Successfully added book";
    }
}
