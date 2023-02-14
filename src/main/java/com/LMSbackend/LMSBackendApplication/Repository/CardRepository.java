package com.LMSbackend.LMSBackendApplication.Repository;

import com.LMSbackend.LMSBackendApplication.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {
}
