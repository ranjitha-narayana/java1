package com.Springexampledemo.demoSpringBoot;

import java.util.List;

public interface MyServiceInterface {
    public  List<Cars> getCars();
    public Cars addCar(Cars cars);
    public Cars  getBycarnum(int carnum);
}
