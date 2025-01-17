package com.springdemo.SpringDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    int personId;
    String fullName;

    Computer computer;

    Person(int personId, String fullName){
        this.fullName = fullName;
        this.personId = personId;
    }

    Person(){}

    public void info() {
        computer.compile();
        System.out.println("PersonId: " + personId);
        System.out.println("FullName: " + fullName);
    }

    @Autowired
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }
}
