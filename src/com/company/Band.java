package com.company;

import java.util.ArrayList;
import java.util.List;

public class Band {
    private String name;

    private List<Musician> musicians;

    public Band(String name) {
        this.name = name;
        this.musicians = new ArrayList<>();
    }

    public void printMusicians() {
        for (Musician musician : this.musicians) {
            System.out.println("I'm " + musician.getAlias() + " (" + musician.getFirstName() + " " + musician.getName() + " )");
        }
    }

    public void addMusician(Musician musician) {
        this.musicians.add(musician);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
