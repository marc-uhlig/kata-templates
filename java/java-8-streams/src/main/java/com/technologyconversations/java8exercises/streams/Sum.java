package com.technologyconversations.java8exercises.streams;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Sum {

    public static int calculate7(final List<Integer> numbers) {
        int total = 0;
        for (final int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculate(final List<Integer> people) {
        return 0;
    }

}
