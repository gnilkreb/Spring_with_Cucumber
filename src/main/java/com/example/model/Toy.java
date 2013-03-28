package com.example.model;

import javax.persistence.*;

@Entity
public class Toy {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String toyName;

    @ManyToOne
    private Person person;

    @Transient
    private int personId;

    public Toy() {
    }

    public Toy(int personId) {
        this.personId = personId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", toyName='" + toyName + '\'' +
                ", person=" + person +
                ", personId=" + personId +
                '}';
    }
}
