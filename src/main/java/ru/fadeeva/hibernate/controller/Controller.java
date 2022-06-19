package ru.fadeeva.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.fadeeva.hibernate.Person;
import ru.fadeeva.hibernate.service.MyService;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    MyService service;

    @GetMapping("/persons/by-city")
    public String getPersonByCity(@RequestParam String city) {
        //List<Person> personList = service.getPersonByCity(city);
        //StringBuilder sb = new StringBuilder();

        return service.getPersonByCity(city);
    }


}
