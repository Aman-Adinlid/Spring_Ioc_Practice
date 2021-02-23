package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.Config.PersonConfig;
import se.lexicon.Dao.PersonDao;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        PersonDao dao = context.getBean("PersonDao", PersonDao.class);


        Person savePerson = dao.save(new Person(1, "Aman", "aman12@gmail.com"));
        System.out.println("savePerson = " + savePerson);
        System.out.println("___________________________________");
        Person FindById = dao.findById(1);
        System.out.println("FindById = " + FindById);
        System.out.println("____________________________________");
        dao.findAll().forEach(System.out::println);
        System.out.println("___________________________");
        boolean remove = dao.delete(1);
        System.out.println("remove = " + remove);


    }
}
