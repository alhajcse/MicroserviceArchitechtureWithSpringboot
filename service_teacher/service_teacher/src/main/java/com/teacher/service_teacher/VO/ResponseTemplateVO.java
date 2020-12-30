package com.teacher.service_teacher.VO;

import com.teacher.service_teacher.model.TeacherInformation;

public class ResponseTemplateVO {
    private TeacherInformation teacherInformation;
    private StudentInformation studentInformation;

    public TeacherInformation getTeacherInformation() {
        return teacherInformation;
    }

    public void setTeacherInformation(TeacherInformation teacherInformation) {
        this.teacherInformation = teacherInformation;
    }

    public StudentInformation getStudentInformation() {
        return studentInformation;
    }

    public void setStudentInformation(StudentInformation studentInformation) {
        this.studentInformation = studentInformation;
    }
}
