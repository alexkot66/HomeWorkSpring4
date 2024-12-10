package com.example.homework4Thymleaf.repository;

import com.example.homework4Thymleaf.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
