package com.technologyconversations.java8exercises.streams;

import com.technologyconversations.java8exercises.streams.model.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Grouping {

    public static Map<String, List<Person>> groupByNationality7(final List<Person> people) {
        final Map<String, List<Person>> map = new HashMap<>();
        for (final Person person : people) {
            if (!map.containsKey(person.nationality())) {
                map.put(person.nationality(), new ArrayList<>());
            }
            map.get(person.nationality()).add(person);
        }
        return map;
    }

    public static Map<String, List<Person>> groupByNationality(final List<Person> people) {
        return null;
    }

}
