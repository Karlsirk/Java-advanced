package org.sda;

import org.sda.model.Person;

import javax.print.DocFlavor;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //LAMBDA EXPRESSION
        Person person = new Person("Karl", "Sirkas","",26);
        Predicate<Person> personTest = test -> test.getAge() > 30;
        System.out.println(personTest.test(person));

        System.out.println(getLenghtOfString("Java is not easy. Jake"));

        Function<String, Integer> getStringLen = s -> s.length();
        System.out.println(getStringLen.apply("Java is not easy.Jake"));

        Predicate<Person> personTest2 = Person::isAdult; //Method reference
        System.out.println(personTest2.test(person));

        //Supplier
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        System.out.println(randomNumberSupplier.get());

        Consumer<Person> printPerson = p -> System.out.println("Person first name " + p.getFirstName() + " Last name " + p.getLastName());
        printPerson.accept(person);

        //Operator
        UnaryOperator<Integer> toSquare = i -> i * i;
        System.out.println(toSquare.apply(4)); //apply() should be called always
        
        //OPTIONAL
        Person person3 = new Person("Tony", "Stark","",54);
        
        Optional<Person> optionalPerson = Optional.of(person3);

        optionalPerson.ifPresent(System.out::println);
        if(optionalPerson.isEmpty()) {
            System.out.println("Person cannot be printed");
        } else {
            System.out.println(optionalPerson.get().toString());


            //STREAMS
            List<String> carList = List.of("BMW","AUDI","skoda","Toyota","Ford");
            carList.stream().findFirst().ifPresent(System.out::println); //findFirst() -> Optional<T>
            carList.stream().findAny().ifPresent(System.out::println); //findAny() -> Optional<T> Find random element in the list

            List<String> filteredCars = carList.stream()
                    .filter(s -> s.length() >= 3) //Filter returns Stream<T>
                    .collect(Collectors.toList()); //Convert Steam<T> to List<T>

            filteredCars.forEach(System.out::println);

            //Map: Used to apply an operation to all the elements in the list
            List<Integer> carLengths = carList.stream()
                    .map(String::length)
                    .collect(Collectors.toList());

            carLengths.forEach(System.out::println);

            //allMatch(): Used to check if all the elements in the list matching a given condition
            boolean isAllCarsGreaterThanFive = carList.stream()
                    .allMatch(s -> s.length() >= 5);
            System.out.println(isAllCarsGreaterThanFive);

            //anyMatch(): Used to check if at least one element in the list matches the given condition
            //HOMEWORK HELP
            boolean isAnyCarStatingWithB = carList.stream()
                    .anyMatch(s -> s.startsWith("B"));
            System.out.println(isAnyCarStatingWithB);

            //reduce(): Used to condense/reduce the list to String
            String cars = carList.stream()
                    .reduce("", ((s, s2) -> (s.equals("") ? "" : s + " ,") +s2 ));
            System.out.println(cars);

            carList.stream()
                    .sorted()
                    .forEach(System.out::println);

            carList.stream()
                    .sorted((car1,car2) -> car2.compareTo(car1))
                    .forEach(System.out::println);

            carList.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);


        }


        System.out.println(getRandomPerson().toString());

        //NESTED CLASS
        Person person4 = new Person("Helar", "Rangoski","helar", 25);
        System.out.println(person4.getUsername());

        Person.Employee employee = person4.new Employee();
        employee.username();
        System.out.println(person4.getUsername());

        //Static
        Person person5 = new Person("Ivo","Kukk","ivo",35);
        System.out.println(person5.getUsername()); // outer class method call

        Person.Customer customer = new Person.Customer(); //Difference in the object instantiation
        customer.username(person5);
        System.out.println(person5.getUsername());
    }
    private static Integer getLenghtOfString(String inputString) {
        int increment = 10;
        return inputString.length() + increment;
    }

    //orElse example
    private static Person getRandomPerson() {
       //Optional<Person> optionalPerson = Optional.empty();
        Optional<Person> optionalPerson = Optional.of(new Person(" Captain "," Estonia ", "",35));
       Person person2 = new Person("Marek","Austin","",33);

       return optionalPerson.orElse(person2);
    }
    
    
}