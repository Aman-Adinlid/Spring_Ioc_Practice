package se.lexicon.Dao;

import org.springframework.stereotype.Component;
import se.lexicon.model.Person;

import java.util.ArrayList;
import java.util.List;

@Component("PersonDao")
public class PersonDaoIml implements PersonDao {

    private List<Person> personList = new ArrayList<>();

    @Override
    public Person save(Person person) {
        if (person.getId() == 0) {
            person.setId(1);
            Person pr = findById(person.getId());
            pr.setName(person.getName());
            pr.setEmail(person.getEmail());
        }
        return null;
    }

    @Override
    public Person findById(int id) {
        return personList.stream().filter(person -> person.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Person> findAll() {
        return personList;
    }

    @Override
    public boolean delete(int id) {
        return personList.removeIf(person -> person.getId() == id);
    }
}
