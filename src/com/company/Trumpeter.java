package com.company;

public class Trumpeter extends Musician {
    public Trumpeter(String alias, String name, String firstName) {
        super(alias, name, firstName);
    }

    @Override
    public void makeMusic(){
        System.out.println("Tuttutututtuuuuuu");
    }
}
