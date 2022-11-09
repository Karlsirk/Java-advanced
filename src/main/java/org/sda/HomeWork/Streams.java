package org.sda.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Character.getName;

public class Streams {
    public static void main(String[] args) {

        List<String> peopleList= List.of("John","Sarah","Mark","Tyla","Ellisha","Eamonn");


        List<Integer> numbersList = List.of (1,4,2346,123,76,11,0,0,62,23,50);

        //Sort the list
        List<String> filteredPeople = peopleList.stream()
                .collect(Collectors.toList());

        filteredPeople.forEach(System.out::println);
        System.out.println(numbersList);

        //Print only those names, that start with E letter.
        boolean isAnyPeopleStatingWithE = peopleList.stream()
                .anyMatch(s -> s.startsWith("E"));
        System.out.println(isAnyPeopleStatingWithE);

        //Print value greater than 30 and less than 200

        for (int i = 0; i < 11; i++)
            if (numbersList.get(i) > 30 )
              if  (numbersList.get(i) < 200)
                System.out.print(numbersList.get(i) + " ");

        System.out.println(" "); //New Line

            //Print names uppercase

        peopleList.stream().map(String::toUpperCase) .forEach(people-> System.out.print(people + " "));

        System.out.println(" "); //New line

        //Remove first and last letter, sort and print names.

        // Didn't t know how do it? Maybe use another class?

        //Sort backwards by implementing reverse Comparator and using lambda expression

        {
            List<Integer> list = Arrays.asList(1,4,2346,123,76,11,0,0,62,23,50);
            list.sort(Collections.reverseOrder());

            System.out.println(list);


        }









    }

    }
