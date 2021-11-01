package com.luxoft.classemployee2;

public class Test {
    public static void main(String[] args){
        Manager roman = new Manager(1,"Man","Roman",27,50_000);
        //Designer yarik = new Designer(2,"Yaroslav",30,"Man",35000,50,50);
        //Developer victoria = new Developer(3,"Victoria",25,"Woman",37000,30);
        //Designer roman1 = new Designer(2,"Roman",27,"Man",37_000,27,50);
        //Employee[] employees={roman,yarik,victoria,roman1};
        EmployeeFactory employeeFactory= new EmployeeFactory();
        Employee[] employee = employeeFactory.generateEmployees(5);
        EmployeeService employeeService=new EmployeeService(employee);
        //employeeService.printEmployees();
        //System.out.println(employeeService.calculateSalaryAndBonus());
        //System.out.println(employeeService.getById(3));
        //employeeService.printEmployees(employeeService.getByName("Ivan"));
        //employeeService.sortByNameAndSalary();
        //employeeService.printEmployees();
        //employeeService.remove(2);
        employeeService.add(roman);
        employeeService.printEmployees();




    }


}
