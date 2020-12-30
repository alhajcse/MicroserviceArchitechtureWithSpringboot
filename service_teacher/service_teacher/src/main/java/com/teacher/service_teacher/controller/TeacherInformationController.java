package com.teacher.service_teacher.controller;

import com.teacher.service_teacher.VO.ResponseTemplateVO;
import com.teacher.service_teacher.model.TeacherInformation;
import com.teacher.service_teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherInformationController {

    @Autowired
    private TeacherService teacherService;


    @GetMapping("/{id}")
    public TeacherInformation getTeacherInformationById(@PathVariable("id") Integer id){

        return teacherService.getTeacherInformationById(id);
    }

    @PostMapping("/save")
    public TeacherInformation saveTeacherInformation(@RequestBody TeacherInformation teacherInformation){

        return teacherService.saveTeacherInformation(teacherInformation);
    }

    @GetMapping("class/{className}")
    public ResponseTemplateVO getTeacherWithStudent(@PathVariable("className") String className){
        return teacherService.getTeacherWithStudent(className);
    }



}
