package com.jdbcTemplate.templatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
public class Bank {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getbankname() {
        List<String> ab = new ArrayList<>();
        ab.addAll(jdbcTemplate.queryForList("select name from bankinfo", String.class));
        return ab;
    }
}
