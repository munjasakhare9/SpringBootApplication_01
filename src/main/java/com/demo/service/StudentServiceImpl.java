package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO sd;

	public int addStudent(Student s) {
		return sd.addStudent(s);

	}

	@Override
	public int deleteStudentById(int id) {
		return sd.deleteStudentById(id);
	}

	@Override
	public Student findStudentById(int id) {
		return sd.findStudentById(id);
	}

	@Override
	public List<Student> findAllStudent() {
		return sd.findAllStudent();
	}

	@Override
	public int updateStudentById(Student s) {
		return sd.updateStudentById(s);
	}
}
