package com.LMSbackend.LMSBackendApplication.Service;

import com.LMSbackend.LMSBackendApplication.Enums.CardStatus;
import com.LMSbackend.LMSBackendApplication.Models.Card;
import com.LMSbackend.LMSBackendApplication.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    public Card createCard(Student student){
        Card newCard = new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudentInfo(student); //For new foreign key column
        return newCard;
    }
}
