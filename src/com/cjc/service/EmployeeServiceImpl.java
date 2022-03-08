package com.cjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.EmployeeDao;
import com.cjc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	@Override
	public void saveEmployee(Employee e) {
		
		dao.saveEmployee(e);
	}

}
