package com.test5.service;

import com.test5.dao.StudentDao;
import com.test5.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistServiceImpl implements RegistService {
    @Autowired
    StudentDao studentDao;

    @Override
    public int studentRegist(Student student, int operateCode) {
        if(studentDao.search(student)!=null) {
            return -1;
        }
        try{
            studentDao.regist(student);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
