package com.example.demo;

import com.example.demo.beans.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        var car = context.getBean("car", Car.class);

        System.out.println(car.getEngine().getName());

        context.close();
    }
}
