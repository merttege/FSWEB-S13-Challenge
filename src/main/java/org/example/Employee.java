package org.example;

import java.util.Arrays;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id, String fullName, String email, String password, String[] healthplans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthplans;
    }

    public void addHealthPlan(int index, String name){
        if(index < 0 ||index >= healthPlans.length){
            System.out.println("Index geçersiz!");
        }else{
            if(healthPlans[index] == null){
                healthPlans[index] = name;
            }else{
                System.out.println("Index dolu.");
            }
        }
    }

    public long getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String[] getHealthPlans(){
        return healthPlans;
    }

    public void setId(long kimlik){
        this.id = kimlik;
    }
    public void setFullName(String tamIsim){
        this.fullName = tamIsim;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setHealthplans(String[] healthplans){
        this.healthPlans = healthplans;
    }

    public String toString(){
        return "Id: " + id + " FullName: " + fullName + " Email: " + email + " Password: " + password + " Health Plans: " + Arrays.toString(healthPlans);
    }
}
