package com.test5.service;

import com.test5.dao.StudentDao;
import com.test5.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    StudentDao studentDao;
    @Override
    public Student getStudentInformation(Student student) throws Exception {
        Student tStudent;
        try {
            tStudent=studentDao.search(student);
        }catch (Exception e){
            throw new Exception("database error");
        }
        if(tStudent!=null) {
            return tStudent;
        }else{
            return null;
        }
    }
}
