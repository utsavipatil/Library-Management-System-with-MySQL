package com.LMSbackend.LMSBackendApplication.Service;

import com.LMSbackend.LMSBackendApplication.Enums.CardStatus;
import com.LMSbackend.LMSBackendApplication.Models.Card;
import com.LMSbackend.LMSBackendApplication.Models.Student;
import com.LMSbackend.LMSBackendApplication.Repository.StudentRepository;
import com.LMSbackend.LMSBackendApplication.RequestDto.StudentRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    CardService cardService;

    public String createTable(StudentRequestDTO studentRequestDTO){
        //Convert DTO to Entity
        Student student = new Student();
        student.setAge(studentRequestDTO.getAge());
        student.setCountry(studentRequestDTO.getCountry());
        student.setName(studentRequestDTO.getName());
        student.setEmail(studentRequestDTO.getEmail());

        Card newCard =  cardService.createCard(student);

        student.setCard(newCard); //Bidirectional relation

        studentRepository.save(student);

        //cardRepository.save() will automatically be done

        return "Successfully added student and card";
    }
}
