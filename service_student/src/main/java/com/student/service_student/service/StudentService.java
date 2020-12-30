package com.student.service_student.service;

import com.student.service_student.model.StudentInformation;
import com.student.service_student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentInformation saveGeneralInformation(StudentInformation studentInformation) {

        return  studentRepository.save(studentInformation);
    }

    public StudentInformation getStudentGeneralInformationById(Integer id) {

        return studentRepository.getStudentGeneralInformationById(id);
    }
}
