package org.sda.lambda;

import org.sda.model.Person;

import java.util.function.Predicate;

/**
 * To validate the person
 *
 * @author Karl Sirkas
 */

public class AdultPersonTest implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return person.getAge() >= 18;
    }
}
