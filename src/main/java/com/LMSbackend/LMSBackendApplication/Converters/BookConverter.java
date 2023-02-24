package com.LMSbackend.LMSBackendApplication.Converters;

import com.LMSbackend.LMSBackendApplication.Models.Book;
import com.LMSbackend.LMSBackendApplication.RequestDto.BookRequestDTO;

public class BookConverter {
    public static Book convertDtoToEntity(BookRequestDTO bookRequestDTO){
        Book book = Book.builder().name(bookRequestDTO.getName())
                    .genre(bookRequestDTO.getGenre())
                    .build();
        return book;
    }
}
