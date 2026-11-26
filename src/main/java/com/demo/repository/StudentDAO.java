package com.demo.repository;

import java.util.List;

import com.demo.entity.Student;

public interface StudentDAO {
	public int addStudent(Student s);

	public int deleteStudentById(int id);

	public Student findStudentById(int id);

	public List<Student> findAllStudent();
	
	public int updateStudentById(Student s);
}
