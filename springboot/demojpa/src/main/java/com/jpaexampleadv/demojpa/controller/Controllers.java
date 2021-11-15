package com.jpaexampleadv.demojpa.controller;

import com.jpaexampleadv.Student;
import com.jpaexampleadv.models.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {
    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("student") Student student, Model model) {
        System.out.println(student.name);
        model.insert(student);
        return "completed";

    }

}
