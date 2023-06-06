package com.example.studentdatails.controller;

import com.example.studentdatails.dto.StudentDto;
import com.example.studentdatails.feign.StudentApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentDetailController {


    private final StudentApi studentApi;



    @GetMapping("/get-oracle-students")
    public ResponseEntity getOracleStudents(){
        StudentDto studentDto = StudentDto.builder()
                .schoolName("Oracle University")
                .budget("2500")
                .students(studentApi.getFindByOracleUniversity())
                .build();
        return ResponseEntity.ok().body(studentDto);

    }

    @GetMapping("/get-eclipseStudents")
    public ResponseEntity getEclipseStudents(){
        StudentDto dto = StudentDto.builder()
                .schoolName("Eclipse University")
                .budget("6000")
                .students(studentApi.getFindByEclipseUniversity())
                .build();

        return ResponseEntity.ok().body(dto);
    }
}
