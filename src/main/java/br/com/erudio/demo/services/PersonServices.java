package br.com.erudio.demo.services;

import br.com.erudio.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private Logger logger = Logger.getLogger(PersonServices.class.getName());
    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id){
        logger.info("Findind one person");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leandro");
        person.setLastName("Costa");
        person.setAddress("Uberlância - Minas Gerais - Brasil");
        person.setGender("Male");
        return person;
    }
}
