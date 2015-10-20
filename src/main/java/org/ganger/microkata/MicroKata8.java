package org.ganger.microkata;


import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * Created by arincon on 29/09/15.
 */
public class MicroKata8 {
    public static List<?> toUpperCase(List<String> collection) {
        return collection.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static List<?> lessThan(List<String> collection, int i) {
        return collection.stream()
                .filter(value -> value.length() < i)
                .collect(toList());
    }

    public static List<?> flat(List<List<String>> collection) {
        return collection.stream()
                .flatMap(value -> value.stream())
                .collect(toList());
    }

    public static Person getOldestPerson(List<Person> people) {
        return people.stream()
                .max(Comparator.comparing(Person::getAge))
                .get();

    }

    public static int sum(List<Integer> numbers) {
        return numbers.stream().reduce(0, (total, number) -> total + number);
    }

    public static Set<?> getKidNames(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(toSet());
    }
}
