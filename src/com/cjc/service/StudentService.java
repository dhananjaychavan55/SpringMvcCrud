package com.cjc.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import com.cjc.dao.StudentDao;
import com.cjc.model.Student;

public interface StudentService {


	List<Student> selectAllStudent(String uname,String pass);
			void saveStudent(Student stu);
			List<Student> deletestudent(int rollno);
			Student editStudent(int rollno);
}
