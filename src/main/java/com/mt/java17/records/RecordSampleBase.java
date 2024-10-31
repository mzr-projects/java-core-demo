package com.mt.java17.records;

public record RecordSampleBase(String name, int age) {
    public RecordSampleBase {
        if (name.equals("MT")) {
            throw new IllegalArgumentException("Name must not be MT");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive number");
        }
    }
}
