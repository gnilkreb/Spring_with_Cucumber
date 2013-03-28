package com.example.service;

import com.example.model.Person;
import com.example.model.Toy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


@Service
public class ToyServiceImpl implements ToyService {

    @PersistenceContext
    EntityManager em;
        
	private List<Toy> toys = new ArrayList<Toy> ();
	
    @Transactional
    public Toy addToy(Toy toy){
        Person person = em.find(Person.class, toy.getPersonId());

        if (person == null){
            throw new RuntimeException("Person with id " + toy.getPersonId() + "not found");
        }
        toy.setPerson(person);
        person.getToys().add(toy);

        em.persist(person);

        return toy;
    }


    @Transactional
    public Toy removeToy(Integer id) {
        Toy toy = em.find(Toy.class, id);
        Person person = toy.getPerson();
        person.getToys().remove(toy);
        em.persist(person);
        em.remove(toy);

        return toy;
    }
    

    @Transactional
    public Person listToysForPersons(int personId) {
        return em.find(Person.class, personId);
    }

    @Transactional
    public List<Toy> list(int personId) {
        return em.createQuery("from Toy t where t.person.id = :id").setParameter("id", personId).getResultList();
    }
}
