package com.Example.service;

import java.util.List;

import com.Example.entity.Student;
import com.Example.repository.IStudentRepository;
import com.Example.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements IStudentService {

	IStudentRepository stuRepo = new StudentRepositoryImpl();
	
	@Override
	public Student addStudent(Student stu) {
		System.out.println("Service add student");
		Student newStu = stuRepo.addStudent(stu);
		return newStu;
	}

	@Override
	public Student updateStudent(int stuId, Student stu) {
		System.out.println("Service update student");
		Student Stu = stuRepo.updateStudent(stuId, stu);
		return stu;
	}

	@Override
	public Student updateStudentName(int stuId, String newName) {
		
		return null;
	}

	@Override
	public Student updateStudentMarks(int stuId, int newMarks) {
		
		return null;
	}

	@Override
	public Student deleteStudentByName(int stuName) {
		
		return null;
	}

	@Override
	public Student deleteStudentById(int stuId) {
		
	  return stuRepo.deleteStudentById(stuId);
		
	}

	@Override
	public Student deleteStudent(Student stu) {
		
		return null;
	}

	@Override
	public List<Student> getAllStudents(int stuName) {
		
		return null;
	}

	@Override
	public Student getStudentId(int Id) {
	
		return null;
	}

	@Override
	public Student getStudentByName(String name) {
		
		return null;
	}

	
	
}
