package com.teacher.service_teacher.repository;

import com.teacher.service_teacher.model.TeacherInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherInformation,Integer> {

    TeacherInformation getTeacherInformationById(Integer id);

   // TeacherInformation findByClassId(String className);
}
