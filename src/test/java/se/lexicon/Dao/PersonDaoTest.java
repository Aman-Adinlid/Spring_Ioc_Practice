package se.lexicon.Dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.lexicon.Config.PersonConfig;
import se.lexicon.model.Person;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersonConfig.class})

public class PersonDaoTest {

    @Autowired
    PersonDao personDao;

    @Test
    public void test_save() {
        Person expected = new Person(1, "test", "test");
        Person actual = personDao.save(new Person(1, "test", "test"));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_findById() {
        Person person = personDao.save(new Person(1, "test", "test"));
        int actualId = person.getId();
        int expectedId = 1;
        Assert.assertEquals(actualId, expectedId);
    }

    @Test
    public void test_findAll() {
        Person expected = personDao.save(new Person(1, "test", "test"));
        List<Person> actual = personDao.findAll();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_delete() {

    }
}
