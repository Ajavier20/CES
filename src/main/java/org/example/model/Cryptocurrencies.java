package org.example.model;

public class Cryptocurrencies {
    private String id;
    private String abbreviation;
    private String name;
    private Double value;

    public Cryptocurrencies(String id,String abbreviation,String name, Double value) {
        this.id=id;
        this.abbreviation=abbreviation;
        this.name=name;
        this.value=value;
    }

    public String getId() {
        return id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public Double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
