package com.technologyconversations.java8exercises.streams;

import com.technologyconversations.java8exercises.streams.model.Person;
import com.technologyconversations.java8exercises.streams.model.Stats;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.IntSummaryStatistics;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PeopleStats {

    public static Stats getStats7(final List<Person> people) {
        long sum = 0;
        int min = people.get(0).age();
        int max = 0;
        for (final Person person : people) {
            final int age = person.age();
            sum += age;
            min = Math.min(min, age);
            max = Math.max(max, age);
        }
        return new Stats(people.size(), sum, min, max);
    }

    public static IntSummaryStatistics getStats(final List<Person> people) {
        return null;
    }

}
