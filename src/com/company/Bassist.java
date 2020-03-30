package com.company;

public class Bassist extends Musician {
    public Bassist(String alias, String name, String firstName) {
        super(alias, name, firstName);
    }

    @Override
    public void makeMusic(){
        System.out.println("Dumdumdumdum");
    }
}
