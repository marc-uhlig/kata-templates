package com.technologyconversations.java8exercises.streams;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ToUpperCase {

    public static List<String> transform7(final List<String> collection) {
        final List<String> newCollection = new ArrayList<>();
        for (final String element : collection) {
            newCollection.add(element.toUpperCase());
        }
        return newCollection;
    }

    public static List<String> transform(final List<String> collection) {
        return null;
    }

}
