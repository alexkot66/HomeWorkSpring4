package com.example.homework4Thymleaf.controller;

import com.example.homework4Thymleaf.model.Person;
import com.example.homework4Thymleaf.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;


    @GetMapping("/persons")
    public String getAllPersons(Model model) {
        List<Person> persons = personService.getAllPersons();
        model.addAttribute("persons", persons);
        model.addAttribute("person", new Person()); // Добавляем пустой объект Person
        return "persons"; // имя шаблона Thymeleaf
    }

    @PostMapping("/persons")
    public String addPerson(@ModelAttribute Person person) {
        personService.createPerson(person);
        return "redirect:/persons"; // перенаправление на страницу со списком пользователей
    }
}
