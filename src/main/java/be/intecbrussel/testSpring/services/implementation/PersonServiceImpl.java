package be.intecbrussel.testSpring.services.implementation;

import be.intecbrussel.testSpring.services.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    public List<Person> allPersons;

    @Override
    public List<Person> allPersons() {
        return allPersons;
    }

    @Override
    public void addPerson(Person person) {
        allPersons.add(person);
    }

    @Override
    public void addPersons(List<Person> personList) {
        allPersons.addAll(personList);
    }

    @Override
    public Person getPerson(int id) {
        return allPersons.get(id);
    }
}
