package com.company;

public class Saenger extends Musiker {
    public Saenger(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }
public void singen(){
    System.out.println("Oh, baby, you are my sunshine");
}
    @Override
    public void musizieren(){
        System.out.println("Youuuu aaaare sooo beautifullllll.");
    }
}
