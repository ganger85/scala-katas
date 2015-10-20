package org.ganger.microkata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by arincon on 29/09/15.
 */
public class MicroKata7 {
    public static List<String> toUpperCase(List<String> collection) {
        List<String> toReturn = new ArrayList<>();
        for (String element : collection) {
            toReturn.add(element.toUpperCase());
        }
        return toReturn;
    }

    public static List<String> lessThan(List<String> collection, int i) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            if (element.length() < i) {
                newCollection.add(element);
            }
        }
        return newCollection;
    }

    public static List<?> flat(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static Person getOldestPerson(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;    }

    public static int sum(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static Set<?> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }
}
