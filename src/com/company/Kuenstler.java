package com.company;

public class Kuenstler extends Person {
    private String kuenstlerName;

    public Kuenstler(String kuenstlerName, String name, String vorname){
        super(name, vorname);
        this.kuenstlerName = kuenstlerName;
    }
}
