package com.Springexampledemo.demoSpringBoot;

public class Cars {
    int carnum;
    String carname;
    String des;

    public Cars(int carnum, String carname, String des) {
        this.carnum = carnum;
        this.carname = carname;
        this.des = des;
    }

    public int getCarnum() {
        return carnum;
    }

    public void setCarnum(int carnum) {
        this.carnum = carnum;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
