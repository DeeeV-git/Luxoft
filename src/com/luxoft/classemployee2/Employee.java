package com.luxoft.classemployee2;

public class Employee {
        long id;
        String name;
        int age;
        double salary;
        String gender;


        Employee(){}
        Employee(long id, String name , int age, String gender, double salary){
            this.id=id;
            this.name=name;
            this.age=age;
            this.gender=gender;
            this.salary=salary;

        }
        public String toString(){
            return "id: "+ id
                    + " name: " + name
                    + " age: " + age
                    + " gender: " + gender
                    + " salary: "+ salary;
        }
        String getName(){
            return name;
        }
        double getSalary(){
            return salary;
        }

    }

