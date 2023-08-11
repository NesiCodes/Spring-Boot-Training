package com.unejsi.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class) //helper class that contains validation logic
@Target({ElementType.FIELD, ElementType.METHOD}) //can be applied to fields and methods
@Retention(RetentionPolicy.RUNTIME) //define how long the annotation will be stored
public @interface CourseCode {

    //define default course code
    public String value() default "NESI";

    //define default error message
    public String message() default "must start with NESI";

    //define default groups
    public Class<?>[] groups() default {}; // can group related constrains

    //define default payloads
    public Class<? extends Payload>[] payload() default {}; // provide custom details about validation failure(security level, error code etc)

}
