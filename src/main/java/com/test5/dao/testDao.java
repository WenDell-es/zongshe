package com.test5.dao;


import com.test5.entity.test;
import org.apache.ibatis.annotations.Mapper;

public interface testDao {


    void save(test t);

    test search(int id);

}
