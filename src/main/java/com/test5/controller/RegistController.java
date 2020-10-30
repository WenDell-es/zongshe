package com.test5.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test5.entity.Student;
import com.test5.service.RegistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegistController {
    @Autowired
    RegistServiceImpl registService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public String regist(@RequestBody String data){
        JSONObject ret=new JSONObject();
        String studentID,password,studentName;
        int operationID,flag;
        try {
            JSONObject json = JSON.parseObject(data);
            studentID = json.getString("studentID");
            studentName = json.getString("studentName");
            password = json.getString("password");
            operationID = json.getInteger("operationID");
            flag=registService.studentRegist(new Student(studentID,studentName,password),2);
        }catch(Exception e){
            ret.put("operationState", 0);
            return ret.toJSONString();
        }
        ret.put("operationState", flag);
        return ret.toJSONString();

    }
}
