package com.technologyconversations.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.technologyconversations.java8exercises.streams.FlatCollection.transform;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class FlatCollectionTest {

    @Test
    void transformShouldFlattenCollection() {
        final var collection = List.of(asList("Viktor", "Farcic"), List.of("John", "Doe", "Third"));
        final var expected = List.of("Viktor", "Farcic", "John", "Doe", "Third");

        final var result = transform(collection);

        assertThat(result).hasSameElementsAs(expected);
    }

}
