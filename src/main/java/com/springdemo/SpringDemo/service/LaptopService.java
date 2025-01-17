package com.springdemo.SpringDemo.service;

import com.springdemo.SpringDemo.model.Laptop;
import com.springdemo.SpringDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService
{

    @Autowired
    private LaptopRepository repository;

    public void addLaptop(Laptop laptop) {
        repository.save(laptop);
    }

    public boolean isGoodForProgramming(Laptop laptop) {
        return true;
    }
}
