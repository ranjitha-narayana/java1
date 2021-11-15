package com.Springexample.SpringDemo.Controllers;

import com.Springexample.SpringDemo.College;
import com.Springexample.SpringDemo.Demo;
import com.Springexample.SpringDemo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Student student;

    @Autowired
    College college;
    @Autowired
    Demo demo;
    @Autowired
    bank bank1;

    @RequestMapping(value = "/studentname")
    public String name() {
        return student.studentname();
    }

    @RequestMapping(value = "/collegename")
    public String collegename() {
        return college.collegename();
    }

    @GetMapping("/bankinfo")

    public List<String> bankinfo() {
       return bank1.bankinfo();

    }
}
