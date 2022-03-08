package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.StudentDao;
import com.cjc.model.Student;

@Service
public class StudentserviceImpl implements StudentService {

	@Autowired
	private StudentDao dao;
	
	@Override
	public List<Student> selectAllStudent(String uname, String pass) {
		
		List l=dao.selectAllStudent(uname, pass);
		return l;
	}

	@Override
	public void saveStudent(Student stu) {
		dao.saveStudent(stu);
	}

	@Override
	public List<Student> deletestudent(int rollno) {
		
		return dao.deleteStudent(rollno);
	}

	@Override
	public Student editStudent(int rollno) {
		return dao.editStudent(rollno);
	}

}
