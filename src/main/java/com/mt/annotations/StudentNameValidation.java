package com.mt.annotations;

import java.lang.reflect.Field;

public enum StudentNameValidation {

    INSTANCE;

    public static <T> void validate(T input) {
        try {
            int numberOfAnnotations = 0;
            for (Field field : input.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(StudentName.class)) {
                    numberOfAnnotations++;
                    StudentName studentName = field.getAnnotation(StudentName.class);
                    if (field.get(input) == null && studentName.studentName() != null) {
                        field.set(input, studentName.studentName());
                        System.out.println("studentName" + numberOfAnnotations + " is : " + studentName.studentName());
                    } else if (field.get(input) != null) {
                        System.out.println("studentName" + numberOfAnnotations + " is : " + studentName.studentName());
                    } else {
                        throw new IllegalArgumentException(
                                "You must specify the name in annotation if you don't fill the object name."
                        );
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not validate input object", e);
        }
    }
}