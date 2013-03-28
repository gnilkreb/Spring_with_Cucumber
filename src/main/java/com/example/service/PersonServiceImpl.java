package com.example.service;

import com.example.model.Person;
import com.example.model.Toy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

import static java.lang.System.out;


@Service
public class PersonServiceImpl implements PersonService {

    @PersistenceContext
    EntityManager em;
        
    @Transactional
    public Person addPerson(Person person) {
    	out.println("got here with ");
    	out.println(person.getFirstName());
    	out.println(em);
        em.persist(person);
        out.println("done with persistencene");

        return person;
    }

    @Transactional
    public List<Person> listPeople() {
        CriteriaQuery<Person> c = em.getCriteriaBuilder().createQuery(Person.class);
        c.from(Person.class);
        return em.createQuery(c).getResultList();
    }

    @Transactional
    public void removePerson(Integer id) {
        System.out.println("[PERSON SERVICE] Deleting person with id = " + id);

        Person person = em.find(Person.class, id);
        if (null == person) {
            return;
        }

        for (Toy toy : person.getToys()){
            System.out.println("Deleting a toy: " + toy);
            em.remove(toy);
        }
        person.getToys().clear();
//        em.persist(person);
//        em.flush();

        System.out.println("[PERSON SERVICE] Children collection cleared");

        em.remove(person);
    }
    
}
