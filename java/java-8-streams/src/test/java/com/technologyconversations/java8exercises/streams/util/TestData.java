package com.technologyconversations.java8exercises.streams.util;

import com.technologyconversations.java8exercises.streams.model.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TestData {

    public static final Person SARA = new Person("Sara", 4, "Norwegian");
    public static final Person VIKTOR = new Person("Viktor", 40, "Serbian");
    public static final Person EVA = new Person("Eva", 42, "Norwegian");
    public static final Person ANNA = new Person("Anna", 5, null);

}
