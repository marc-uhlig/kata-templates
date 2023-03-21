package com.technologyconversations.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.technologyconversations.java8exercises.streams.Sum.calculate;
import static org.assertj.core.api.Assertions.assertThat;

/*
Sum all elements of a collection
 */
class SumTest {

    @Test
    void calculateShouldReturnSumOfAllIntegersInCollection() {
        final var numbers = List.of(1, 2, 3, 4, 5);

        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}
