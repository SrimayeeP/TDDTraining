package com.kinandcarta.testdd.controller;

import com.kinandcarta.testdd.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/person/{id}")
    public ResponseEntity<Object> getPerson(@PathVariable int id){
        ResponseEntity<Object> responseEntity = null;
        if(id == 1) {
            Person person = new Person();
            person.setName("test");
            person.setAge(11);
            responseEntity = new ResponseEntity<>(person, HttpStatus.OK);
        } else
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return responseEntity;
    }
}
