package be.intecbrussel.testSpring.services;

import be.intecbrussel.testSpring.services.implementation.Person;

import java.util.List;

public interface PersonService {

    public List<Person> allPersons();
    void addPerson (Person person);
    void addPersons (List<Person> personList);
    public Person getPerson(int id);

}
