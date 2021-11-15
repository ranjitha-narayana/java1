package com.Springexampledemo.demoSpringBoot.Controller;

import com.Springexampledemo.demoSpringBoot.Cars;
import com.Springexampledemo.demoSpringBoot.Services.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyServices myservices;
    @GetMapping("cars")
    public List<Cars> cars(){
        return myservices.getCars();

    }
    @PostMapping("addCar")
    public Cars addCar(@RequestBody Cars car){
        return myservices.addCar(car);

    }
    @GetMapping("carbycarnum")
    public Cars carBycarnum(@RequestParam("carnum") int carnum){
        return myservices.getBycarnum(carnum);
    }
}
