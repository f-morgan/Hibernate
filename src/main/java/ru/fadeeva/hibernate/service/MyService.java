package ru.fadeeva.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fadeeva.hibernate.repository.MyRepository;

import java.util.List;

@Service
public class MyService {
    @Autowired
    MyRepository repository;

    public String getPersonByCity(String city) {
        return repository.getPersonByCity(city);
    }
}
