package com.technologyconversations.java8exercises.streams;

import com.technologyconversations.java8exercises.streams.model.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Kids {

    public static Set<String> getKidNames7(final List<Person> people) {
        final Set<String> kids = new HashSet<>();
        for (final Person person : people) {
            if (person.age() < 18) {
                kids.add(person.name());
            }
        }
        return kids;
    }

    public static Set<String> getKidNames(final List<Person> people) {
        return null;
    }

}
