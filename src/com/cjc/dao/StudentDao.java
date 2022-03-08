package com.cjc.dao;

import java.util.List;

import com.cjc.model.Student;

public interface StudentDao {

	void saveStudent(Student student);

	List<Student> selectAllStudent(String uname, String pass);

	List<Student> deleteStudent(int rollno);

	Student editStudent(int rollno);
}
