package org.ganger.microkata;

/**
 * Created by arincon on 29/09/15.
 */
public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
