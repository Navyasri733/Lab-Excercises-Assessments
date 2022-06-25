package com.Example.repository;

import java.util.List;

import com.Example.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentRepositoryImpl implements IStudentRepository {

	@Override
	public Student addStudent(Student stu) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		System.out.println("Repository add student");
		em.getTransaction().begin();
		em.persist(stu);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return stu;
	}

	@Override
	public Student updateStudent(int stuId, Student stu) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Repository update student");
		
		em.getTransaction().begin();
		
		Student dbStu = em.find(Student.class,stuId);
		dbStu.setName(stu.getName());
		dbStu.setStuId(stu.getStuId());
		em.merge(dbStu);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return dbStu;
		
		
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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student stu = em.find(Student.class, stuId);
		em.remove(stu);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		return stu;
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
