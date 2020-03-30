package com.company;

public class Trompeter extends Musiker {
    public Trompeter(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }

    @Override
    public void musizieren(){
        System.out.println("Tuttutututtuuuuuu");
    }
}
