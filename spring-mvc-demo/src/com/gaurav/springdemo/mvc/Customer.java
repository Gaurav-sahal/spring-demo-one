package com.gaurav.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.gaurav.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	
	//Spring MVC Form Validation - Applying Built-in Validation Rules
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;

	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}", message="only 6 chars/digits")
	private String postalCode;
	
	@CourseCode(value = "TOPS", message = "must start with TOPS")
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
}

/*fOR VALIDATING A STRING 
 * 1. Add Validation rule to Customer class 
 * 2. Display error message on HTML form 
 * 3. Perform Validation in the Controller class 
 * 4. Update confirmation page
 */

/*FOR VALIDATING A NUMBER RANGE
 * 1. Add Validation rule to Customer class 
 * 2. Display error message on HTML form 
 * 3. Perform Validation in the Controller class 
 * 4. Update confirmation page
 */

/*
 * HOW TO HANDLE STRING INPUT FOR INTEGER FIELDS 
 * 1. Create custom error message in src/resources/messages.properties 
 * 2. Load custom messages resources in Spring config file - webcontent/web-inf/spring-mvc-demo-servlet.xml
 */


/*
 * CUSTOM ANNOTATION 
 * 1. Create custom validation rule 
 * 2. Add validation rule to Customer class 
 * 3. Display error message on Html form 
 * 4. Update Confirmation page
 */