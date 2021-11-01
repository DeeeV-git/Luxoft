package com.luxoft.classemployee2;

import java.util.Random;

public class EmployeeFactory {
    private long id=0;
    private int size;
    private int rate=50;
    String gender1="";
    Random random=new Random();
    private String[] nameWoman={"Alena","Alisa","Victoria","Julia"};
    private String[] nameMan={"Alecsandr","Denis","Roman","Ivan"};
    private String[] gender={"Man","Woman"};


    Employee[] generateEmployees(int size){
        Employee[] employees=new Employee[size];

        for (int i = 0; i < size; i++) {
            Employee employee1=new Employee();
            employees[i]=employee1;
        }
        for (int i = 0; i < employees.length; i++) {
            int randomInt=random.nextInt(3);


            switch (randomInt){
                case 0:
                    employees[i] = new Manager(randomId(),randomGender(),randomName(),randomAge(),randomSalary());
                    break;
                case 1:
                    employees[i] = new Designer(randomId(),randomGender(),randomName(),randomAge(),randomSalary(),rate,randomWorkedDays());
                    break;
                case 2:
                    employees[i] = new Developer(randomId(),randomGender(),randomName(),randomAge(),randomSalary(),randomFixedBugs());
            }

        }
        return employees;
    }
    long randomId(){
        id++;
        return id;
    }
    String randomGender(){
        this.gender1 =gender[random.nextInt(gender.length)];
        return  gender1;

    }
    String randomName() {

        if (gender1.equals("Man")) {
            return nameMan[random.nextInt(nameMan.length)];
        }
        else{
            return nameWoman[random.nextInt(nameWoman.length)];
//
        }

    }


    int randomAge(){return (int) (Math.random() * (40 - 20)) + 20;}
    double randomSalary(){ return (double) (Math.random() * (50000 - 25000)) + 25000;}
    int randomWorkedDays(){return (int) (Math.random() * (30 - 1)) + 1;}
    int randomFixedBugs(){return (int) (Math.random() * (100 - 25)) + 25;}
}
