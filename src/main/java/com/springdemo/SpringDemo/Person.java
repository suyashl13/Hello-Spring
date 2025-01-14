package com.springdemo.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    int personId;
    String fullName;

    @Autowired
    Laptop laptop;

    Person(int personId, String fullName){
        this.fullName = fullName;
        this.personId = personId;
    }

    Person(){}

    public void info() {
        laptop.compile();
        System.out.println("PersonId: " + personId);
        System.out.println("FullName: " + fullName);
    }

}
