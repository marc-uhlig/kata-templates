package com.technologyconversations.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.technologyconversations.java8exercises.streams.Partitioning.partitionAdults;
import static com.technologyconversations.java8exercises.streams.util.TestData.*;
import static org.assertj.core.api.Assertions.assertThat;

class PartitioningTest {

    @Test
    void partitionAdultsShouldSeparateKidsFromAdults() {
        final var collection = List.of(SARA, EVA, VIKTOR);

        final var result = partitionAdults(collection);

        assertThat(result).isNotEmpty();
        assertThat(result.get(true)).hasSameElementsAs(List.of(VIKTOR, EVA));
        assertThat(result.get(false)).hasSameElementsAs(List.of(SARA));
    }

}
