package org.sda;

import org.sda.model.Person;

public class Main {
    public static void main(String[] args) {
        //No-arg constructor call
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.getId());

        //All-argument constructor call
        Person person1 = new Person(12345L, "Karl-Erik","Sirkas", "abc@gmail.com","5423123","Tartu tee Tallinn");
        System.out.println(person1.toString());

        Person person2 = new Person();
        person2.setFirstName("Tony");
        person2.setLastName("Stark");

        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());

    }
}