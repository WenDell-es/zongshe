package com.test5.controller;


import com.test5.entity.test;
import com.test5.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private testService testservice;

    @PostMapping("/save")
    public String save(@RequestBody test t){
        System.out.printf(t.toString());
        testservice.insertTest(t);
        return "cccc";
    }


    @PostMapping("/search")
    public String search(int id){
        System.out.println("id = " + id);
        test a=testservice.SearchTest(id);
        return a.toString();
    }

}
