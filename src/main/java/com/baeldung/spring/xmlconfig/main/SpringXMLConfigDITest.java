package com.baeldung.spring.xmlconfig.main;

import com.baeldung.spring.xmlconfig.domain.constructor.SolarSystemConstructorDi;
import com.baeldung.spring.xmlconfig.domain.setter.SolarSystemSetterDi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLConfigDITest {
    public static void main(String[] args) {

        SolarSystemConstructorDi milkyWayConstructorDi = getSolarSystemConstructorDiFromXMLConfig();
        SolarSystemSetterDi milkyWaySetterDi = getSolarSystemSetterDiFromXMLConfig();

        System.out.println("(XML Config)");
        System.out.println("Diameter of the earth is : " + milkyWayConstructorDi.getEarth().getDiameter() + " km");
        System.out.println("Diameter of the moon is : " + milkyWayConstructorDi.getMoon().getDiameter() + " km\n");

        System.out.println("Diameter of the uranus is : " + milkyWaySetterDi.getUranus().getDiameter() + " km");
        System.out.println("Diameter of the jupiter is : " + milkyWaySetterDi.getJupiter().getDiameter() + " km\n");
    }

    private static SolarSystemConstructorDi getSolarSystemConstructorDiFromXMLConfig() {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppConfigConstructor.xml");
        return context.getBean(SolarSystemConstructorDi.class);
    }

    private static SolarSystemSetterDi getSolarSystemSetterDiFromXMLConfig() {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppConfigSetter.xml");
        return context.getBean(SolarSystemSetterDi.class);
    }
}