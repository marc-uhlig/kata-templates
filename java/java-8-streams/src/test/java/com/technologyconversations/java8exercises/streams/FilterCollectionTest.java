package com.technologyconversations.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.technologyconversations.java8exercises.streams.FilterCollection.transform;
import static org.assertj.core.api.Assertions.assertThat;

class FilterCollectionTest {

    @Test
    void transformKeepStringsShorterThant4Characters() {
        final var collection = List.of("My", "name", "is", "John", "Doe");
        final var expected = List.of("My", "is", "Doe");

        final var result = transform(collection);

        assertThat(result).hasSameElementsAs(expected);
    }

}
