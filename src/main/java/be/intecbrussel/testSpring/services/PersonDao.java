package be.intecbrussel.testSpring.services;

import be.intecbrussel.testSpring.services.implementation.Person;

import java.util.List;

public interface PersonDao {

    void createPerson (Person person);

    public Person readPerson (int id);

    void updatePerson(Person person);

    void deletePerson(Person person);

    public List<Person> personDB();
}
