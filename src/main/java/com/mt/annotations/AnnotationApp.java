package com.mt.annotations;

public class AnnotationApp {
    public static void main(String[] args) throws ClassNotFoundException {

        Student student = new Student();
        student.setFirstName("Jimmy");
        System.out.println(student);

        StudentNameValidation.validate(student);
        System.out.println(student);
    }
}
