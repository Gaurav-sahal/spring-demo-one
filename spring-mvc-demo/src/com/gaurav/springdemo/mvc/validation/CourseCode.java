package com.gaurav.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//Helper class that contains business rules/validation logic
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
//can apply our annotation to a method or field
@Target({ElementType.METHOD, ElementType.FIELD})
//Retain this annotation in the java class file & Process it at Runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	//define default course code
	public String value() default "LUV";
	
	//define default error message
	public String message() default "must start with LUV";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
