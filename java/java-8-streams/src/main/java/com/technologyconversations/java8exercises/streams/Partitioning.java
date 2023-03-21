package com.technologyconversations.java8exercises.streams;

import com.technologyconversations.java8exercises.streams.model.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults7(final List<Person> people) {
        final Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (final Person person : people) {
            map.get(person.age() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdults(final List<Person> people) {
        return null;
    }

}
