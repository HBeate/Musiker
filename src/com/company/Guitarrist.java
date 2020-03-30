package com.company;

public class Guitarrist extends Musician {
    public Guitarrist(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }

    @Override
    public void makeMusic(){
        System.out.println("Tschiiiiiingzääääääänggggg.");
    }
}
