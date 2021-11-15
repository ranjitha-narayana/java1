package com.jdbcTemplate.templatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class ViewController {
    @Autowired
    Bank bank;
    @Autowired
    Login login;

    @GetMapping (value="/example")
    public  String demo(){
        return "index";
    }

    @RequestMapping(value="/bankinfo")

    public List<String>bankinfo() {
        return bank.getbankname();
    }

    @PostMapping(value="/login")
    public String Login(@RequestBody Login login){
        System.out.println(login.getUsername());
        System.out.println(login.getPassword());
        return "login is done";
    }
    @GetMapping(value="params")
    public String params(@RequestParam("pass") String name){
        return "hellow"+name;
    }
    @GetMapping(value = "header")
    public String header(@RequestHeader("name") String name,@RequestHeader("pass") String pass){
        return "hello"+name;
    }
}
