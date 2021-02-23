package se.lexicon.Dao;

import se.lexicon.model.Person;

import java.util.List;

public interface PersonDao {

    Person save(Person person);

    Person findById(int id);

    List<Person> findAll();

    boolean delete(int id);

}
