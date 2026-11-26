package com.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.entity.Student;
import com.demo.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate j;

	@Override
	public int addStudent(Student s) {
		String sql = "insert into student(name, city, percentage) values(?,?,?)";
		return j.update(sql, new Object[] { s.getName(), s.getCity(), s.getPercentage() });
	}

	@Override
	public int deleteStudentById(int id) {
		String sql = "delete from student where id=?";
		return j.update(sql, id);
	}

	@Override
	public Student findStudentById(int id) {
		String sql = "select id, name, city, percentage from student where id=?";
		List<Student> list = j.query(sql, new StudentRowMapper(), id);
		return (!list.isEmpty()) ? list.get(0) : null;
	}

	@Override
	public List<Student> findAllStudent() {
		String sql = "select id, name, city, percentage from student";
		return j.query(sql, new StudentRowMapper());
	}

	@Override
	public int updateStudentById(Student s) {
		String sql = "update student set name=?, city=?, percentage=? where id=?";
		return j.update(sql, new Object[] { s.getName(), s.getCity(), s.getPercentage(), s.getId() });
	}

}
