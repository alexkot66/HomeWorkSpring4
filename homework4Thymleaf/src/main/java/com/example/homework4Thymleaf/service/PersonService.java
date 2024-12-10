package com.example.homework4Thymleaf.service;

import com.example.homework4Thymleaf.model.Person;
import com.example.homework4Thymleaf.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    /**
     * Метод возвращает всех пользователей из репозитория
     * @return возвращает список пользователей из репозитория
     */

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    /**
     * Метод создает нового пользователя и записывает в репозиторий
     * @param person новый пользователь
     * @return сохраняет запись в репозитории о новом пользователе
     */
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }
}
