package com.student.service_student.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SERVICE-TEACHER")
public interface RestClient {

    @RequestMapping(method= RequestMethod.GET,value = "/teacher/teacher_name")
    String getTeacherName();
}
