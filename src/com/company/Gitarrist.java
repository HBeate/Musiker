package com.company;

public class Gitarrist extends Musiker {
    public Gitarrist(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }

    @Override
    public void musizieren(){
        System.out.println("Tschiiiiiingzääääääänggggg.");
    }
}
