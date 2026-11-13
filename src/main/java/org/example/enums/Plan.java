package org.example.enums;

public enum Plan {
    BASIC("Basic", 10);

    private String name;
    private int price;

    private Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
