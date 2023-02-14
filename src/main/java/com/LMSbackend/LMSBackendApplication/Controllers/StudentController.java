package com.LMSbackend.LMSBackendApplication.Controllers;

import com.LMSbackend.LMSBackendApplication.RequestDto.StudentRequestDTO;
import com.LMSbackend.LMSBackendApplication.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody()StudentRequestDTO studentRequestDTO){
        String result = studentService.createTable(studentRequestDTO);
        return new ResponseEntity<>(result , HttpStatus.CREATED);
    }
}
