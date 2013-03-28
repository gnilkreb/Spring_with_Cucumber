package com.example.service;


import com.example.model.Person;
import com.example.model.Toy;

import java.util.List;

public interface ToyService {
    
    public Toy addToy(Toy toy);
    public Person listToysForPersons(int personId);
    public Toy removeToy(Integer id);
    public List<Toy> list(int personId);
}
