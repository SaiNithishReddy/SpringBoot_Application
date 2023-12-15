package com.vcube.trails.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="b31students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY )
	private long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	public Student() {}
	public Student(long id, String firestName, String lastName) {
		this.id = id;
		this.firstName = firestName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return id+" : " + firstName + " : " + lastName;
	}
	//getters and setters 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
}