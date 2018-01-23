package com.baeldung.spring.javaconfig.domain.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SolarSystemSetterDi {

    private Uranus uranus;
    private Jupiter jupiter;

    public Uranus getUranus() {
        return uranus;
    }
    @Autowired
    public void setUranus(Uranus uranus) {
        this.uranus = uranus;
    }

    public Jupiter getJupiter() {
        return jupiter;
    }
    @Autowired
    public void setJupiter(Jupiter jupiter) {
        this.jupiter = jupiter;
    }
}
