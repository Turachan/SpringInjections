package com.baeldung.spring.xmlconfig.domain.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class SolarSystemConstructorDi {

    private Moon moon;
    private Earth earth;

    public SolarSystemConstructorDi(Moon moon, Earth earth) {
        this.moon = moon;
        this.earth = earth;
    }

    public Moon getMoon() {
        return moon;
    }

    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    public Earth getEarth() {
        return earth;
    }

    public void setEarth(Earth earth) {
        this.earth = earth;
    }
}
