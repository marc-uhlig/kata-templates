package com.technologyconversations.java8exercises.streams;

import com.technologyconversations.java8exercises.streams.model.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Joining {

    public static String namesToString7(final List<Person> people) {
        final String label = "Names: ";
        final StringBuilder sb = new StringBuilder(label);
        for (final Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.name());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToString(final List<Person> people) {
        return null;
    }

}
