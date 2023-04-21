package com.mt.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Inherited
@Documented
public @interface StudentName {

    String studentName() default "";

    int sizeOfName() default 100;

    Class<?> allowedTypes() default String.class;
}
