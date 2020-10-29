package com.test5.controller;

import com.alibaba.fastjson.JSONObject;
import com.test5.entity.Student;
import com.test5.service.InformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentInformationController {
    @Autowired
    InformationServiceImpl informationService;
    @RequestMapping(value = "/student/information",method = RequestMethod.POST)
    @ResponseBody
    public String studentInformation(@CookieValue(name = "ID")String ID){
        JSONObject ret=new JSONObject();
        Student student;
        try {
            student=informationService.getStudentInformation(new Student(ID));
        } catch (Exception e) {
            return "数据库错误";
        }
        if(student!=null){
            ret.put("studentName", student.getStudentName());
            ret.put("studentID", student.getStudentID());
            ret.put("subjectName", student.getSubjectID());
            ret.put("teamID", student.getTeamID());
        }
        return ret.toJSONString();
    }
}
