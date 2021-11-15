package com.Springexampledemo.demoSpringBoot.Config;

import com.Springexampledemo.demoSpringBoot.Services.MyServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public MyServices myservices(){
        return  new MyServices();
    }
}
