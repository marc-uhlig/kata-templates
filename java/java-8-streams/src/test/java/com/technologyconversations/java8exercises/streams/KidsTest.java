package com.technologyconversations.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.technologyconversations.java8exercises.streams.Kids.getKidNames;
import static com.technologyconversations.java8exercises.streams.util.TestData.*;
import static org.assertj.core.api.Assertions.assertThat;

class KidsTest {

    @Test
    void getKidNameShouldReturnNamesOfYoungerThan18() {
        final var collection = List.of(SARA, EVA, VIKTOR, ANNA);

        final var result = getKidNames(collection);

        assertThat(result)
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }

}
