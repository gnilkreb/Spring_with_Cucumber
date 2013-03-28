package com.example.service;


import com.example.model.Person;

import java.util.List;

public interface PersonService {
    
    public Person addPerson(Person person);
    public List<Person> listPeople();
    public void removePerson(Integer id);
}
