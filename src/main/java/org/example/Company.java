package org.example;
import java.util.Arrays;
import java.sql.SQLOutput;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;

        if(giro < 0){
            this.giro = 0;
        }
    }

    public void addEmployee(int index, String name){
        if(index < 0 ||index >= developerNames.length){
            System.out.println("Index geçersiz!");
        }else{
            if(developerNames[index] == null){
                developerNames[index] = name;
            }else{
                System.out.println("Index dolu.");
            }
        }
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGiro(){
        return giro;
    }
    public String[] getDeveloperNames(){
        return developerNames;
    }

    public void setId(long kimlik){
        this.id = kimlik;
    }
    public void setName(String isim){
        this.name = isim;
    }
    public void setGiro(double giroSet){
        if(giroSet < 0){
            this.giro = 0;
        }else{
            this.giro = giroSet;
        }
    }
    public void setDeveloperNames(String[] developerIsim){
        this.developerNames = developerIsim;
    }

    public String toString(){
        return "Id: " + id + " Name: " + name + " Giro: " + giro + " Developer Names: " + Arrays.toString(developerNames);
    }
}
