package org.example.model;

public class Cryptocurrency {
    private String id;
    private String abbreviation;
    private String name;
    private Double value;

    public Cryptocurrency(String id, String abbreviation, String name, Double value) {
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
    @Override
    public String toString() {
        return String.format("Cryptocurrency{Id='%s', Abbreviation='%s', Name='%s', Value=%.2f}", id, abbreviation, name, value);
    }
}
