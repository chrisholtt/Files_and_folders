package com.codeclan.example.week14_hw.repositories;
import com.codeclan.example.week14_hw.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
