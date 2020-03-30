package com.company;

public class BackgroundSaengerin extends Saenger {
    public BackgroundSaengerin(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }

    @Override
    public void musizieren() {
        System.out.println("Lalalalalalalalaaaaaa");
    }
}
