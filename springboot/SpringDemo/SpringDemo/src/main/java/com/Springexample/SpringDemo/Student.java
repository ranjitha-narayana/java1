package com.Springexample.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired
    College college;
    public String studentname(){
        return "you are in student class inside studentname function";
    }
    public  String studentcollege(){
        return "you are in student class inside studentcollege function";
    }
}
