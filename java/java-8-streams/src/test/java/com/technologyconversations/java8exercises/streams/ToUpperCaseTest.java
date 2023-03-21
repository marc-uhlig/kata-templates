package com.technologyconversations.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.technologyconversations.java8exercises.streams.ToUpperCase.transform;
import static org.assertj.core.api.Assertions.assertThat;

class ToUpperCaseTest {

    @Test
    void transformShouldConvertCollectionElementsToUpperCase() {
        final var collection = List.of("My", "name", "is", "John", "Doe");
        final var expected = List.of("MY", "NAME", "IS", "JOHN", "DOE");

        final var result = transform(collection);

        assertThat(result).hasSameElementsAs(expected);
    }

}
