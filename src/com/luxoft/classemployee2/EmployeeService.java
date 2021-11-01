package com.luxoft.classemployee2;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeService {
    Employee[] employees;
    EmployeeService(Employee[]employees){
        this.employees=employees;
    }
    //public void printEmployees(){
    //    System.out.println(this.employees.toString());
    //}
    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public void printEmployees(Employee[]employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    double calculateSalaryAndBonus(){
        double sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].getSalary();
        }
        return sum;
    }
    Employee getById(long id) {
        for (Employee employee : employees) {
            if (id == employee.id) {
                return employee;
            }
        }
        System.out.println("Співробітника з таким Id немає в базі даних.");
        return null;
    }
    Employee[] getByName(String name) {
        int length = 0;
        for (Employee employee : employees) {
            if (name.equals(employee.name)) {
                length++;
            }
        }
        if(length==0){
            System.out.println("Співробітника з таким іменем немає в базі даних.");
        }
        Employee[] arrayEqual = new Employee[length];
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].name)) {
                arrayEqual[counter] = employees[i];
                counter++;
            }
        }
        return arrayEqual;
    }
    Employee[] sortByName(){
        Arrays.sort(employees, Comparator.comparing(Employee::getName));
        return employees;
    }
    Employee[] sortByNameAndSalary(){
        Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        return employees;
    }
    Employee edit(Employee person) {
        Employee temporary;
        for (int i = 0; i < employees.length; i++) {
            if (person.id == employees[i].id) {
                temporary = employees[i];
                employees[i] = person;
                person = temporary;
                return person;
            }
        }
        System.out.println("Співробітника з таким Id немає в базі даних.");
        return null;
    }

    Employee remove(long id) {
        boolean bool = false;
        Employee oldEmployee=null;
        for (Employee employee : employees) {
            if (id == employee.id) {
                oldEmployee=employee;
                bool = true;
            }
        }
        if(!bool) {
            System.out.println("Співробітника з таким Id немає в базі даних.");
            return null;
        }
        Employee[] newEmployee=new Employee[employees.length-1];
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].id!=id){
                newEmployee[count]=employees[i];
                count++;
            }
        }
        employees=newEmployee;
        return oldEmployee;
    }
    void add(Employee addEmployee){
        Employee[] newEmployee = new Employee[employees.length+1];
        for (int i = 0; i < employees.length; i++) {
            newEmployee[i]=employees[i];
        }
        newEmployee[newEmployee.length-1]=addEmployee;
        employees=newEmployee;
    }
}
