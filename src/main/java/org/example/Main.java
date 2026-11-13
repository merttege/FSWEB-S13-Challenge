package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args){
        run();
    }

    public static void run(){
        Company company = new Company(1, "WorkinTech", 20000, new String[]{"Ahmet", "Zeynep"});
        Healthplan healthplan = new Healthplan(2, "Basic Health", Plan.BASIC);
        Employee employee = new Employee(3, "Mehmet", "mehmet@gmail.com", "123456", new String[]{"Basic Health"});

        System.out.println(company.toString());
        System.out.println(healthplan.toString());
        System.out.println(employee.toString());
    }
}