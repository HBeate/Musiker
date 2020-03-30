package com.company;

public class BackgroundSinger extends Singer {
    public BackgroundSinger(String alias, String name, String firstName) {
        super(alias, name, firstName);
    }

    @Override
    public void makeMusic() {
        System.out.println("Lalalalalalalalaaaaaa");
    }
}
