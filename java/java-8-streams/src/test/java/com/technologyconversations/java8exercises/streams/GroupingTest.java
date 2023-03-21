package com.technologyconversations.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.technologyconversations.java8exercises.streams.Grouping.groupByNationality;
import static com.technologyconversations.java8exercises.streams.util.TestData.*;
import static org.assertj.core.api.Assertions.assertThat;

class GroupingTest {

    @Test
    void partitionAdultsShouldSeparateKidsFromAdults() {
        final var collection = List.of(SARA, EVA, VIKTOR);

        final var result = groupByNationality(collection);

        assertThat(result).isNotEmpty();
        assertThat(result.get("Norwegian")).hasSameElementsAs(List.of(SARA, EVA));
        assertThat(result.get("Serbian")).hasSameElementsAs(List.of(VIKTOR));
    }

}
