package com.company;

public class Bassist extends Musiker {
    public Bassist(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }

    @Override
    public void musizieren(){
        System.out.println("Dumdumdumdum");
    }
}
