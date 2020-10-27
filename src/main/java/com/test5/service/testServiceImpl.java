package com.test5.service;

import com.test5.dao.testDao;
import com.test5.entity.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class testServiceImpl implements testService{

    @Autowired
    private testDao testdao;

    @Override
    public void insertTest(test t) {
        testdao.save(t);
    }

    @Override
    public test SearchTest(int id) {
        return testdao.search(id);
    }
}
