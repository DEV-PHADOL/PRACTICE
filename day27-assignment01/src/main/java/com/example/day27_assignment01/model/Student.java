package com.example.day27_assignment01.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Student {
	@NotBlank(message = "First Name is Required.")
	@Size(min=2,max=12,message="First name must be between 2 and 12 character")
	protected String firstName;
	@NotBlank(message = "Last Name is Required.")
	@Size(min=2,max=12,message="Last name must be between 2 and 12 character")
	protected String lastName;
	@NotBlank(message = "Email is required")
	@Email(message = "Email should be Valid")
	protected String email;

    @Min(value=18, message = "Minimum working age 18")
    @Max(value=60, message = "Maximum working age 60")
	protected int age;

	

	

	public Student() {
		super();
	}

	
	
	public Student(String firstName, String lastName, String email, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + age + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
