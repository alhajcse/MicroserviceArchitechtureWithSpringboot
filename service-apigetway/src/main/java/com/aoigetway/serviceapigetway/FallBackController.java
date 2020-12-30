package com.aoigetway.serviceapigetway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/studentServiceFallBack")
    public String studentServiceFallBack(){
        return "Student service fall back"+" Please try again later";
    }

    @GetMapping("/teacherServiceFallBack")
    public String teacherServiceFallBack(){
        return "Teacher service fall back"+" Please try again later";
    }


}
