package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.entity.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

@SpringBootApplication
public class App {

	private final StudentServiceImpl studentServiceImpl;

	App(StudentServiceImpl studentServiceImpl) {
		this.studentServiceImpl = studentServiceImpl;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		StudentService ss = context.getBean(StudentService.class);

		// insert student data

		/*
		 * Student s = new Student(); s.setName("Vivek Verma"); s.setCity("Jodhpur");
		 * s.setPercentage(90.50);
		 * 
		 * 
		 * int rowAffected = ss.addStudent(s); System.out.println(rowAffected);
		 */

		// delete student by id

		/*
		 * int rowAffectedCount = ss.deleteStudentById(9);
		 * System.out.println(rowAffectedCount);
		 */

		// find student by id
		/*
		 * Student s = ss.findStudentById(10); System.out.println(s);
		 */

		// find all Student

		/*
		 * List<Student> students = ss.findAllStudent(); for (Student s : students) {
		 * System.out.println(s.getId() + "-" + s.getName() + "-" + s.getCity() + "-" +
		 * s.getPercentage()); }
		 */

		// update student

		Student s = ss.findStudentById(8);
		s.setCity("Nashik");
		int rowAffectedCount = ss.updateStudentById(s);
		System.out.println(rowAffectedCount);
	}
}
