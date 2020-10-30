package com.test5.controller;


import com.test5.entity.body.LoginResponseBody;
import com.test5.entity.body.LoginRquestBody;
import com.test5.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public LoginResponseBody studentLogin(@RequestBody LoginRquestBody data, HttpServletResponse response){

        LoginResponseBody ret=new LoginResponseBody();
        ret.setOperationState(1);
        ret.setRole(1);
        int flag;
        try {
            flag=loginService.studentLogin(data.getStudentID(),data.getPassword(),data.getOperationID());
        }catch(Exception e){
            ret.setOperationState(0);
            return ret;
        }
        if(flag==0){
            Cookie id = new Cookie("ID", data.getStudentID());
            id.setMaxAge(60*60);
            id.setDomain("localhost");
            id.setPath("../");
            id.setSecure(true);
            response.addCookie(id);
            ret.setOperationState(1);
            return ret;
        }else{
            ret.setOperationState(-1);
            return ret;
        }
    }
}

