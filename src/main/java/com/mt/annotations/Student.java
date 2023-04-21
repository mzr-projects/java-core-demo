package com.mt.annotations;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {

    @StudentName(studentName = "my man", sizeOfName = 10)
    private String firstName;

    @StudentName(studentName = "BRO", sizeOfName = 30)
    private String lastName;

    private int age;

    private String emailAddress;
}
