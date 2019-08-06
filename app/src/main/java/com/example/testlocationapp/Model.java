package com.example.testlocationapp;

public class Model {
    private String Division,City;

    public Model() {
    }

    public Model(String division, String city) {
        Division = division;
        City = city;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
