package com.test5.service;

import com.test5.entity.Student;

public interface LoginService {
    int studentLogin(String studentID,String password, int operateCode);
    int teacherLogin(String teacherID,String password,int operateCode);
}
