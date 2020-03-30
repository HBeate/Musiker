package com.company;

public class Singer extends Musician {
    public Singer(String alias, String name, String firstName) {
        super(alias, name, firstName);
    }
public void sing(){
    System.out.println("Oh, baby, you are my sunshine");
}
    @Override
    public void makeMusic(){
        System.out.println("Youuuu aaaare sooo beautifullllll.");
    }
}
