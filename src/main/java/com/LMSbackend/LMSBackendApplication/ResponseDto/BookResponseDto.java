package com.LMSbackend.LMSBackendApplication.ResponseDto;

import com.LMSbackend.LMSBackendApplication.Enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BookResponseDto {
    String name;
    Genre genre;
}
