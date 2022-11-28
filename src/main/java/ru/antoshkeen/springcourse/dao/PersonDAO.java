package ru.antoshkeen.springcourse.dao;

import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class PersonDAO {/*

    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


*//*
   private final JdbcTemplate jdbcTemplate;

  @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*//*

    @Transactional(readOnly = true)
    public List<Person> index() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select p from Person p", Person.class).getResultList();
        //return jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(Person.class));
    }

    @Transactional(readOnly = true)
    public Person show(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Person.class, id);
        *//*return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
                .stream().findAny().orElse(null);*//*
    }

    @Transactional
    public void save(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.save(person);
        *//*jdbcTemplate.update(
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
        );*//*
    }

    @Transactional
    public void update(int id, Person updatedPerson) {

        Session session = sessionFactory.getCurrentSession();

        Person personToBeUpdated = session.get(Person.class, id);

        personToBeUpdated.setOperationDate(updatedPerson.getOperationDate());
        personToBeUpdated.setCito(updatedPerson.getCito());
        personToBeUpdated.setTimeStart(updatedPerson.getTimeStart());
        personToBeUpdated.setTimeFinish(updatedPerson.getTimeFinish());
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setRegion(updatedPerson.getRegion());
        personToBeUpdated.setBirthday(updatedPerson.getBirthday());
        personToBeUpdated.setDepartment(updatedPerson.getDepartment());
        personToBeUpdated.setHistoryNumber(updatedPerson.getHistoryNumber());
        personToBeUpdated.setTimeDose(updatedPerson.getTimeDose());
        personToBeUpdated.setDose(updatedPerson.getDose());
        personToBeUpdated.setStents(updatedPerson.getStents());
        personToBeUpdated.setElevation(updatedPerson.getElevation());
        *//*jdbcTemplate.update("UPDATE Person SET operationdate=?, cito=?, timestart=?, timefinish=?, name=?, region=?, birthday=?, department=?, historynumber=?, timedose=?, dose=?, stents=?, elevation=? WHERE id=?",
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
        );*//*
    }

    @Transactional
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(session.get(Person.class, id));
        //jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
    }





    *//*public void testMultipleUpdate() {
        List<Person> people = create1000People();
    }

    private List<Person> create1000People() {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            people.add(new Person())
        }
    }*/
}