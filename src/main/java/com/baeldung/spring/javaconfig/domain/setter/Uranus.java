package com.baeldung.spring.javaconfig.domain.setter;


public class Uranus {
    private Integer diameter;

    public Uranus(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }
}