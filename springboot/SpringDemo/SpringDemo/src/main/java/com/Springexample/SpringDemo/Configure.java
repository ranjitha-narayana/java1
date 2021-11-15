package com.Springexample.SpringDemo;

import com.Springexample.SpringDemo.Controllers.bank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {
    @Bean
    public Student student(){
        return new Student();
    }
    @Bean
    public College college(){
        return new College();
    }
    @Bean
    public Demo demo(){
        return new Demo();
    }
    @Bean
    public  bank bank1(){
        return new bank();
    }
}
