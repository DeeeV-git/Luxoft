package com.luxoft.classemployee2;

public class Designer extends Employee{
    int rate;
    int workedDays;
    Designer(long id,String gender, String name, int age,  double salary, int rate, int workedDays ){
        super(id,name,age,gender,salary);
        this.rate=rate;
        this.workedDays=workedDays;
    }

    @Override
    public String toString(){
        return super.toString()+" rate: "+ rate + " workedDays: " + workedDays;
    }

    @Override
    double getSalary(){
        return salary+rate*workedDays;
    }
}
