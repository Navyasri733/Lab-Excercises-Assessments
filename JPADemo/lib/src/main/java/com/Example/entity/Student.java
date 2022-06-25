package com.Example.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stu")
public class Student { // student

	@Id
	@GeneratedValue
	private int stuId;

	@Column(name = "fullname")
	private String name;

	@Column(name = "rollno")
	private int rollno;

	@Column(name = "marks")
	private int marks;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="address")
	private List<Address> address;
	 private Department dept;
	
	//@OneToOne(cascade= {CascadeType.REFRESH , CascadeType.PERSIST})
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="login")
	private Login login;

	private String email;
	private String password;

	public Student(int stuId, String name) {
		super();
		this.stuId = stuId;
		this.name = name;
	}

	

	public Student(int stuId, String name, int rollno) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.rollno = rollno;
	}

	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	public Student(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	// getter and setter method

	
	public int getStuId() {
		return stuId;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", rollno=" + rollno + ", marks=" + marks + ", login="
				+ login + "]";
	}

	
}
