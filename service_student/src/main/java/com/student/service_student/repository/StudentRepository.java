package com.student.service_student.repository;

import com.student.service_student.model.StudentInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentInformation,Integer> {

    StudentInformation getStudentGeneralInformationById(Integer id);
}
