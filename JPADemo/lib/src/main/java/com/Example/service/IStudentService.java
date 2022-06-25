package com.Example.service;

import java.util.List;

import com.Example.entity.Student;

public interface IStudentService {

	Student updateStudent(int stuId,Student name);
	Student updateStudentName(int stuId, String newName);
	Student updateStudentMarks(int stuId, int newMarks);
    Student deleteStudentByName(int stuName);
    Student deleteStudentById(int stuId);
    Student deleteStudent(Student stu);
	List<Student> getAllStudents(int stuName);
	Student getStudentId(int Id);
    Student getStudentByName(String name);
    Student addStudent(Student stu);
	

}
