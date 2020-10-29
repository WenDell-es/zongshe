package com.test5.dao;

import com.test5.entity.Student;
import org.springframework.stereotype.Component;

@Component("StudentDao")
public interface StudentDao {
    Student search(Student student);
    void regist(Student student);
}
