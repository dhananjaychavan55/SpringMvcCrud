package com.cjc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void saveEmployee(Employee e) {
		Session session = sf.openSession();
		session.save(e);
		session.beginTransaction().commit();
		System.out.println("Employee Save");
	}

}
