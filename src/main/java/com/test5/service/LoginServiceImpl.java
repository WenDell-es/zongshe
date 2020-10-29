package com.test5.service;

import com.test5.dao.StudentDao;
import com.test5.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    StudentDao studentDao;

    @Override
    public int studentLogin(String studentID, String password, int operateCode) {
        Student tStudent=studentDao.search(new Student(studentID));
        if(tStudent==null)
            return -2;
        if(tStudent.getStudentPassword().equals(password)){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public int teacherLogin(String teacherID, String password, int operateCode) {
        return -1;
    }
}
