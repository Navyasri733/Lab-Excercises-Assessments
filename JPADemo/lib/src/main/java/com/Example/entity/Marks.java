package com.Example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Marks {
	@Id
	@GeneratedValue
	private int id;
	private int marks;
	
	private Marks() {}

	public Marks(int marks) {
		super();
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
