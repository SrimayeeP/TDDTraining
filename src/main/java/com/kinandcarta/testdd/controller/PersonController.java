package com.kinandcarta.testdd.controller;

import com.kinandcarta.testdd.model.Person;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    public Person getPerson(){
        Person person = new Person();
        person.setName("test");
        person.setAge(12);

        return person;
    }
}
