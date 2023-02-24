package com.LMSbackend.LMSBackendApplication.RequestDto;

import com.LMSbackend.LMSBackendApplication.Enums.Genre;
import lombok.Data;

@Data
public class BookRequestDTO {

    private String name;
    private Genre genre;
    private int authorId;
}
