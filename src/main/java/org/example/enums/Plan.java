package org.example.enums;

public enum Plan {
    BASIC("Basic", 10);

    private String name;
    private double price;

    private Plan(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
