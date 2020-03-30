package com.company;

public class Musiker extends Kuenstler {
    public Musiker ( String kuenstlerName, String name, String vorname){
        super(kuenstlerName, name, vorname);
    }
    public void musizieren (){
        System.out.println("OO Mmmmmmmmmmmh, OO Mmmmmmmmmmh");
    }
}
