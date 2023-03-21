package com.technologyconversations.java8exercises.streams.model;

public record Stats(long count, long sum, int min, int max) {

    public double getAverage() {
        return count > 0
                ? (double) sum / count
                : 0.0d;
    }

}
