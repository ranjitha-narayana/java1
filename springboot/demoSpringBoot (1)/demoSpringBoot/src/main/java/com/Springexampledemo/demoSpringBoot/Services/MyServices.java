package com.Springexampledemo.demoSpringBoot.Services;

import com.Springexampledemo.demoSpringBoot.Cars;
import com.Springexampledemo.demoSpringBoot.MyServiceInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServices  implements MyServiceInterface {
    List<Cars> list=new ArrayList<>();
    public MyServices(){
        list.add(new Cars(123,"BMW","It is having high performance"));
        list.add(new Cars(444,"Audi","it is having unique design"));
    }
    @Override
    public List<Cars> getCars() {
        return list;
    }

    @Override
    public Cars addCar(Cars cars) {
        this.list.add(cars);
        return cars;
    }

    @Override
    public Cars getBycarnum(int carnum) {
        for(Cars cars:this.list){
            if(cars.getCarnum()==carnum){
                return  cars;
            }
        }
        return null;
    }
}
