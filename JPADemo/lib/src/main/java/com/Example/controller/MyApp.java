package com.Example.controller;

import java.util.Scanner;

import com.Example.entity.Address;
import com.Example.entity.Login;
import com.Example.entity.Student;
import com.Example.service.AddressServiceImpl;
import com.Example.service.IAddressService;
import com.Example.service.IStudentService;
import com.Example.service.StudentServiceImpl;

public class MyApp {

	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		IStudentService stuServ = new StudentServiceImpl();
		IAddressService addrServ = new AddressServiceImpl();

		System.out.println("Choose any option from below: ");
		System.out.println("1. Add Student");
		System.out.println("2. update Student");
		System.out.println("3. Delete Student By Id");
		System.out.println("4. Get All Students");
		System.out.println("5. Get Student By Id");
		System.out.println("6. update Student By Name");
		System.out.println("7. update Student name");
		System.out.println("8. update Student By Marks");
		System.out.println("9. Add new address");
		System.out.println("10. Student Registration");
		
		int selectedOption = sc.nextInt();

		switch (selectedOption) {
		case 1:
			System.out.println("Enter Name:  ");
			String name = sc.next();

			System.out.println("Enter rollno");
			Integer rollno = sc.nextInt();

			System.out.println("Enter address");
			String address = sc.next();

			Student stu = new Student(name, rollno);
			Student newStu = stuServ.addStudent(stu);

			System.out.println(newStu.getName() + "added successfully");
			break;

		case 2:

			System.out.println("Enter stuId: ");
			int id = sc.nextInt();

			System.out.println("Enter newName: ");
			String newName = sc.next();

			System.out.println("Enter new marks: ");
			int marks = sc.nextInt();

			Student stu1 = new Student(id, newName, marks);
			Student updatedStu = stuServ.updateStudent(id, stu1);

			System.out.println(updatedStu + "updated successfully");
			break;
		case 3:
			System.out.println("Enter stu id: ");
			int stuId = sc.nextInt();

			Student stu2 = stuServ.deleteStudentById(stuId);
			System.out.println(stu2.getName() + " deleted successfully");
			break;
		case 9:
			System.out.println("Enter city name: ");
			String city = sc.next();
			
			System.out.println("Enter District name: ");
			String district = sc.next();
			
			System.out.println("Enter state: ");
			String state = sc.next();

			Address addr = new Address();
			addr.setCity(city);
			addr.setDistrict(district);
			addr.setState(state);

			Address newAddr = addrServ.addAddress(addr);
			
			// print success message after adding address
			System.out.println(newAddr.getAddrId() + " created successfully");
			break;
		case 10:
			System.out.println("Enter  new name:  ");
			String newName3 = sc.next();

			System.out.println("Enter new Id: ");
			Integer id3 = sc.nextInt();
			
			System.out.println("Enter  email:  ");
			String email3 = sc.next();
			
			System.out.println("Enter  password:  ");
			String password3 = sc.next();
			
			Student stu3 = new Student(email3, password3);
			stu3.setName(newName3);
			stu3.setStuId(id3);
			
			Login login = new Login(email3,password3);
			stu3.setLogin(login);
			
			Student newStu1 = stuServ.addStudent(stu3);
			System.out.println(newStu1.getName()+ "added successfully");
			
			break;
		default:
			System.out.println("Invalid option. Enter any value between 1 and 9 ");
		}

	}
}
