package com.unejsi.demoo.rest;

import com.unejsi.demoo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> students = new ArrayList<>();

    @PostConstruct
    public void loadData(){
        students.add(new Student("Unejsi", "Isufaj"));
        students.add(new Student("Filan", "Fisteku"));
        students.add(new Student("John", "Doe"));
    }

    //define endpoint for /students: return a list of students
    @GetMapping("/students")
    public List<Student> returnStudents(){
        return students;
    }

    //define endpoint for /students/studentId: return a single student with requested id
    @GetMapping("/students/{studentId}")
    public Student returnStudentOnId(@PathVariable int studentId){

        if(studentId >= students.size() || (studentId < 0)){
            throw new StudentNotFoundException("Student with id: " + studentId + " was not found.");
        }

        return students.get(studentId);
    }





}
