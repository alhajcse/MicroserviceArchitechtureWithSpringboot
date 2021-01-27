package com.student.service_student.controller;

import com.student.service_student.client.RestClient;
import com.student.service_student.model.StudentInformation;
import com.student.service_student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentInformationController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private RestClient restClient;

    @GetMapping("/user")
    public String hello() {
        System.out.println("Hello User");
        return "Hello Dude !! Its User Service ";
    }

    @GetMapping("/{id}")
    public StudentInformation getStudentGeneralInformationById(@PathVariable("id") Integer id){

        System.out.println("yes mamamamam");
        return studentService.getStudentGeneralInformationById(id);
    }

    @PostMapping("/save")
    public StudentInformation saveGeneralInformation(@RequestBody StudentInformation studentInformation){

        return studentService.saveGeneralInformation(studentInformation);
    }

    @GetMapping("/teacher_name")
    public String getTeacherName(){
        return restClient.getTeacherName();
    }




}
