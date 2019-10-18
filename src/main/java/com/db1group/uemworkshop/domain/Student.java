package com.db1group.uemworkshop.domain;

import java.util.UUID;

public class Student {

	private UUID id;
	private String firstName;
	private String lastName;

	public Student(UUID id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UUID getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
}
