package com.springdemo.SpringDemo.repository;

import com.springdemo.SpringDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("Saved in database.");
    }


}
