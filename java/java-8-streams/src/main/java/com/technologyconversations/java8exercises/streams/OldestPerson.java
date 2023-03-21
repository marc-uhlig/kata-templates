package com.technologyconversations.java8exercises.streams;

import com.technologyconversations.java8exercises.streams.model.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OldestPerson {

    public static Person getOldestPerson7(final List<Person> people) {
        Person oldestPerson = new Person("", 0, null);
        for (final Person person : people) {
            if (person.age() > oldestPerson.age()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPerson(final List<Person> people) {
        return null;
    }

}
