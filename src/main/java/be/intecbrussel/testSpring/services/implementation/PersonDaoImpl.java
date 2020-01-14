package be.intecbrussel.testSpring.services.implementation;

import be.intecbrussel.testSpring.services.PersonDao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    private List<Person> personDB;

    public PersonDaoImpl(){
        personDB = new ArrayList<Person>();
        Person person1 = new Person("Fitch", LocalDate.of(1978,03,14),0,"Robert");
        Person person2 = new Person("Maxwell", LocalDate.of(1991,11,1),1,"Stephen");
        personDB.add(person1);
        personDB.add(person2);
    }

    public List<Person> getPersonDB() {
        return personDB;
    }

    @Override
    public void createPerson(Person person) {
        personDB.add(person);
    }

    @Override
    public Person readPerson(int id) {
        return personDB.get(id);
    }

    @Override
    public void updatePerson(Person person) {
        personDB.get(person.getId()).setFirstName(person.getFirstName());
        personDB.get(person.getId()).setLastName(person.getLastName());
        personDB.get(person.getId()).setDateOfBirth(person.getDateOfBirth());
        System.out.println("Person: ID " + person.getId() + " , updated in the database");
    }

    @Override
    public void deletePerson(Person person) {
        personDB.remove(person);
        System.out.println("Peson: ID " + person.getId() +  " , deleted from database");
    }

    @Override
    public List<Person> personDB() {
        return personDB;
    }




}
