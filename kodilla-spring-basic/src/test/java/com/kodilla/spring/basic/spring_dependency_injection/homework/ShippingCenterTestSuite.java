package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {
    @Test
    public void shouldReturnSuccessWhenPackageDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Testowa 12", 20.0);
        Assertions.assertEquals("Package delivered to: Testowa 12", result);
    }

    @Test
    public void shouldReturnFailureWhenPackageNotDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Testowa 12", 35.0);
        Assertions.assertEquals("Package not delivered to: Testowa 12", result);
    }
}
