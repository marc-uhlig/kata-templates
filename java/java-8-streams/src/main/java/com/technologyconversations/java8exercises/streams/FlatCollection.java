package com.technologyconversations.java8exercises.streams;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FlatCollection {

    public static List<String> transform7(final List<List<String>> collection) {
        final List<String> newCollection = new ArrayList<>();
        for (final List<String> subCollection : collection) {
            for (final String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform(final List<List<String>> collection) {
        return null;
    }

}
