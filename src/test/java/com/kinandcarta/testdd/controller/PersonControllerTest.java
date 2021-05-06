package com.kinandcarta.testdd.controller;

import com.kinandcarta.testdd.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PersonControllerTest {

    @Autowired
    PersonController personController;

    @Test
    public void testGetPerson(){
        Person person = personController.getPerson();
        assertEquals("test",person.getName());
        assertEquals(12,person.getAge());
    }
}
