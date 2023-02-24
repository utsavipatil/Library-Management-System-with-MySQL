package com.LMSbackend.LMSBackendApplication.Repository;

import com.LMSbackend.LMSBackendApplication.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
