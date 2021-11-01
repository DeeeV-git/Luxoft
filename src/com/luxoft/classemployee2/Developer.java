package com.luxoft.classemployee2;

import java.util.Random;

public class Developer extends Employee{
    int fixedBugs;

    Developer(long id,String gender, String name, int age,  double salary, int fixedBugs){
        super(id,name,age,gender,salary);
        this.fixedBugs=fixedBugs;
    }

    @Override
    public String toString(){
        return  super.toString()+ " fixedBugs: " + fixedBugs;
    }

    @Override
    double getSalary(){
        Random random = new Random();
        return (salary+ fixedBugs*10)*(random.nextBoolean()?2:0);
    }
}
