package com.company;

public class Artist extends Person {
    private String alias;

    public Artist(String alias, String name, String firstName) {
        super(name, firstName);
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
