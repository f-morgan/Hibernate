package ru.fadeeva.hibernate.repository;

import org.springframework.stereotype.Repository;
import ru.fadeeva.hibernate.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public String getPersonByCity(String city) {
        Query query = entityManager.createQuery("select p from Person p where p.cityOfLiving = :city");
        query.setParameter("city", city.toUpperCase());
        List<Person> personList= (List) query.getResultList().stream().collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (Person p:personList) {
            sb.append(p.toString());
            sb.append("\n\n");
        }
        return sb.toString();
    }
}
