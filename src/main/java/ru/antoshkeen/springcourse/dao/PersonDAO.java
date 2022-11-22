package ru.antoshkeen.springcourse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.antoshkeen.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
       return jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person show(int id) {
        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
                .stream().findAny().orElse(null);
    }

    public void save(Person person) {
        jdbcTemplate.update(
                "INSERT INTO Person(operationdate, cito, timestart, timefinish, name, region, birthday, department, historynumber, timedose, dose, stents, elevation) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                person.getOperationDate(),
                person.getCito(),
                person.getTimeStart(),
                person.getTimeFinish(),
                person.getName(),
                person.getRegion(),
                person.getBirthday(),
                person.getDepartment(),
                person.getHistoryNumber(),
                person.getTimeDose(),
                person.getDose(),
                person.getStents(),
                person.getElevation()
        );
    }

    public void update(int id, Person updatedPerson) {
        jdbcTemplate.update("UPDATE Person SET operationdate=?, cito=?, timestart=?, timefinish=?, name=?, region=?, birthday=?, department=?, historynumber=?, timedose=?, dose=?, stents=?, elevation=? WHERE id=?",
                updatedPerson.getOperationDate(),
                updatedPerson.getCito(),
                updatedPerson.getTimeStart(),
                updatedPerson.getTimeFinish(),
                updatedPerson.getName(),
                updatedPerson.getRegion(),
                updatedPerson.getBirthday(),
                updatedPerson.getDepartment(),
                updatedPerson.getHistoryNumber(),
                updatedPerson.getTimeDose(),
                updatedPerson.getDose(),
                updatedPerson.getStents(),
                updatedPerson.getElevation(),
                id
        );
    }

    public void delete(int id) {
       jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
    }

    /*public void testMultipleUpdate() {
        List<Person> people = create1000People();
    }

    private List<Person> create1000People() {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            people.add(new Person())
        }
    }*/
}