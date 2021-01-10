package com.teacher.service_teacher.service;

import com.teacher.service_teacher.VO.ResponseTemplateVO;
import com.teacher.service_teacher.VO.StudentInformation;
import com.teacher.service_teacher.model.TeacherInformation;
import com.teacher.service_teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    RestTemplate restTemplate;

    public TeacherInformation saveTeacherInformation(TeacherInformation teacherInformation) {

        return  teacherRepository.save(teacherInformation);
    }

    public TeacherInformation getTeacherInformationById(Integer id) {

        return teacherRepository.getTeacherInformationById(id);
    }

    public ResponseTemplateVO getTeacherWithStudent(String className) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
//        TeacherInformation teacherInformation=teacherRepository.findByClassId(className);
//
       
        StudentInformation studentInformation=restTemplate.getForObject("http://SERVICE-STUDENT/students/"+className,StudentInformation.class);
        responseTemplateVO.setStudentInformation(studentInformation);
//        responseTemplateVO.setTeacherInformation(teacherInformation);
        return responseTemplateVO;
    }

}
