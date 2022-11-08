package org.sda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Person { //Outer class
    private String firstName;
    private String lastName;
    private String username;
    private int age;

    public boolean isAdult() {return age >= 18;}


    //Non-static master class
    public class Employee{ //Inner class
        private String address;
        public void username() {
            username = firstName.concat(lastName).toLowerCase().replace(" ", ""); //Change value out of class


        }
    }

    //Static master class: not bound to outer class
    @Getter
    public static class Customer{
        public void username(Person person){
            person.username = person.firstName.concat(person.lastName).toLowerCase().replace(" ", "");
        }
    }
}



