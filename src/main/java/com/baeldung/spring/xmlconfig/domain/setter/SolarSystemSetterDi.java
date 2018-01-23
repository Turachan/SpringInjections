package com.baeldung.spring.xmlconfig.domain.setter;



public class SolarSystemSetterDi {

    private Uranus uranus;
    private Jupiter jupiter;

    public Uranus getUranus() {
        return uranus;
    }

    public void setUranus(Uranus uranus) {
        this.uranus = uranus;
    }

    public Jupiter getJupiter() {
        return jupiter;
    }
    public void setJupiter(Jupiter jupiter) {
        this.jupiter = jupiter;
    }
}
