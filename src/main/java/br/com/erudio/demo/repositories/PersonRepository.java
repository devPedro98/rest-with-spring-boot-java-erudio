package br.com.erudio.demo.repositories;

import br.com.erudio.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
