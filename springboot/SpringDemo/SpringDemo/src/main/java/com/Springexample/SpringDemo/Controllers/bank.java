package com.Springexample.SpringDemo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class bank {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> bankinfo() {
        List<String> ab=new ArrayList<>();

       ab.addAll(jdbcTemplate.queryForList("select * from bankinfo",String.class));
       return  ab;

    }
}
