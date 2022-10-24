package org.sda.model;

import java.util.Random;

/**
 * Person model
 * Example of Encapsulation
 *
 * @author Karl Sirkas
 */
public class Person {
    // Fields
private Long id;
private String FirstName;
private String LastName;
private String email;
private String phoneNumber;
private String address;

    // All arguments constructor
    public Person(Long id, String firstName, String lastName, String email, String phoneNumber, String address) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Person(Long id, String address){
        this.id = id;
        this.address = address;
    }

    //Java will create a constructor automatically by default. It is called as default constructor.

    //No-Arg constructor
    public Person(){
        this.id = new Random().nextLong();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
