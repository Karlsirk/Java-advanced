package org.sda;

import org.sda.model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //ENCAPSULATION
        //No-arg constructor call
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.getId());

        //All-argument constructor call
        Person person1 = new Person(12345L, "Karl", "Sirkas", "abc@gmail.com", "+37254260521", "Tartu tee, Tallinn");
        System.out.println(person1.toString());
        System.out.println(person1.getEmail());

        Person person2 = new Person();
        person2.setFirstName("Tony");
        person2.setLastName("Stark");
        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());


        Dog dog = new Dog(true, "GERMAN SHEPPERD");
        System.out.println(dog.toString());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());


        //INHERITANCE
        Passenger passenger = new Passenger(PaymentType.CARD, "Parnu");
        passenger.setEmail("passenger@gmail.com"); // Access Person fields using Passenger object

        PrivatePassenger privatePassenger = new PrivatePassenger(PaymentType.CARD, "Viljandi");
        privatePassenger.setPersonalIDCode("238746521873"); //Access PrivatePassenger's field
        privatePassenger.setDestinationAddress("tartu"); //Access Passenger's field
        privatePassenger.setPhoneNumber("+3722387647654"); //Access Person's field


        //Overriding
        Person personOverride = new Person();
        personOverride.setEmail("karlsirkas@gmail.com");
        System.out.println(personOverride.getEmail());

        Passenger passengerOverride = new Passenger();
        passengerOverride.setEmail("karlsirkas@gmail.com");
        System.out.println(passengerOverride.getEmail());


        //Polymorphism
        Person person3 = new Person(12345L, "Parnu");
        Person person4 = new Passenger(PaymentType.CARD, "Viljandi");
        System.out.println(person3.toString());
        System.out.println(person4.toString());


        // Calling parent methods
        Passenger passenger1 = new Passenger();
        passenger1.setAddress("Tallinn"); // Person.address
        passenger1.setDestinationAddress("Tartu"); // Passenger.destinationAddress
        System.out.println(passenger1.getAddresses());


        //Calling parent's hidden field
        passenger1.getHiddenAlive();

        //passing parameters
        Passenger passenger2 = new Passenger(123456L, "Tallinn", PaymentType.CASH, "Tartu");
        printPersonAddress(passenger2);
        printPassengerWithPrefix("Passenger: ", passenger2);


        //Composition exercise
        Muzzle muzzle = new Muzzle();
        muzzle.setId(890L);
        muzzle.setNoiseRange(10);
        muzzle.setTooNoisy(true);


        Dog dog1 = new Dog(true, "DOBER");
        dog1.setMuzzle(muzzle);

        System.out.println(dog1.getMuzzle().toString());


        //enums
        System.out.println(PaymentType.CARD); // prints enum 'CARD'
        System.out.println(Arrays.toString(PaymentType.values())); // prints all the enum values
        System.out.println(PaymentType.BANK_TRANSFER.getValue()); // prints the value of the enum '3'
    }


    private static void printPersonAddress(Person person) {
        System.out.println(person.getAddress());
    }

    private static void printPassengerWithPrefix(String prefix, Object object) {
        System.out.println(prefix + object);
    }
}