package com.jpaexampleadv.config;

import com.jpaexampleadv.models.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Model student1() {
        return new Model();
    }

}
