package com.baeldung.spring.xmlconfig.domain.constructor;


public class Moon {
    private Integer diameter;

    public Moon(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }
}
