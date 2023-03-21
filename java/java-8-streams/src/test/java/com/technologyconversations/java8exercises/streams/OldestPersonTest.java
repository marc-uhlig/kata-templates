package com.technologyconversations.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.technologyconversations.java8exercises.streams.OldestPerson.getOldestPerson;
import static com.technologyconversations.java8exercises.streams.util.TestData.*;
import static org.assertj.core.api.Assertions.assertThat;

class OldestPersonTest {

    @Test
    void getOldestPersonShouldReturnOldestPerson() {
        final var collection = List.of(SARA, EVA, VIKTOR);

        final var result = getOldestPerson(collection);

        assertThat(result).isEqualTo(EVA);
    }

}
