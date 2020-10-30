package com.test5.service;

import com.test5.DemoApplication;
import com.test5.dao.StudentDao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
public class LoginServiceImplTest {
    @Autowired
    StudentDao dao;
    @Autowired
    LoginServiceImpl loginServiceimpl;

    @Test
    public void studentLogin() {
        int t=loginServiceimpl.studentLogin("2018091601007","123",1);
    }
}
