package ru.antoshkeen.springcourse.services;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.antoshkeen.springcourse.models.Operator;
import ru.antoshkeen.springcourse.models.Person;
import ru.antoshkeen.springcourse.models.Tool;
import ru.antoshkeen.springcourse.repositories.PeopleRepository;

import java.util.Collections;
import java.util.List;import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PeopleService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> findAll() {
        return peopleRepository.findAll();
    }

    public List<Tool> findAllTools(int id) {
        Optional<Person> person = peopleRepository.findById(id);
        return person.get().getTools();
    }


    public Person findOne(int id) {
        Optional<Person> foundPerson = peopleRepository.findById(id);

        return foundPerson.orElse(null);
    }

    @Transactional
    public void save(Person person) {
        peopleRepository.save(person);
    }

    @Transactional
    public void update(int id, Person updatedPerson) {
        updatedPerson.setId(id);
        peopleRepository.save(updatedPerson);
    }

    @Transactional
    public void delete(int id) {
        peopleRepository.deleteById(id);
    }

    public List<Tool> getToolsByPersonId(int id) {
        Optional<Person> person = peopleRepository.findById(id);
        if (person.isPresent()) {
            Hibernate.initialize(person.get().getTools());
            return person.get().getTools();
        }
        else { return Collections.emptyList(); }
    }

}
