package org.example;
import org.example.enums.Plan;

import java.util.Arrays;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Plan getPlan(){
        return plan;
    }

    public void setId(int kimlik){
        this.id = kimlik;
    }
    public void setName(String isim){
        this.name = isim;
    }
    public void setPlan(Plan plan){
        this.plan = plan;
    }

    public String toString(){
        return "Id: " + id + " Name: " + name + " Plan: " + plan;
    }
}
