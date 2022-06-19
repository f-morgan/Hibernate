package ru.fadeeva.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String cityOfLiving;

    public Person() {
    }

    public Person(int id, String name, String surname, int age, String phoneNumber, String cityOfLiving) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.cityOfLiving = cityOfLiving;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cityOfLiving='" + cityOfLiving + '\'' +
                '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }
}
