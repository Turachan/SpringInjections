package com.baeldung.spring.javaconfig.main;

import com.baeldung.spring.javaconfig.config.AppConfig;
import com.baeldung.spring.javaconfig.domain.constructor.SolarSystemConstructorDi;
import com.baeldung.spring.javaconfig.domain.setter.SolarSystemSetterDi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigDITest {
    public static void main(String[] args) {
//        SolarSystem milkyWay = getSolarSystemFromXml();

        SolarSystemConstructorDi milkyWayConstructorDi = getSolarSystemConstructorDiFromJavaConfig();
        SolarSystemSetterDi milkyWaySetterDi = getSolarSystemSetterDiFromJavaConfig();

        System.out.println("(Java Config)");
        System.out.println("Diameter of the earth is : " + milkyWayConstructorDi.getEarth().getDiameter() + " km");
        System.out.println("Diameter of the moon is : " + milkyWayConstructorDi.getMoon().getDiameter() + " km\n");

        System.out.println("Diameter of the uranus is : " + milkyWaySetterDi.getUranus().getDiameter() + " km");
        System.out.println("Diameter of the jupiter is : " + milkyWaySetterDi.getJupiter().getDiameter() + " km\n");
    }

    private static SolarSystemConstructorDi getSolarSystemConstructorDiFromJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        return context.getBean(SolarSystemConstructorDi.class);
    }

    private static SolarSystemSetterDi getSolarSystemSetterDiFromJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        return context.getBean(SolarSystemSetterDi.class);
    }

}