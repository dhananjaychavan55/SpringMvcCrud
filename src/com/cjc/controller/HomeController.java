package com.cjc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.dao.StudentDaoImpl;
import com.cjc.model.Addres;
import com.cjc.model.Employee;
import com.cjc.model.Student;
import com.cjc.service.EmployeeService;
import com.cjc.service.StudentService;

@Controller
public class HomeController {

	 public HomeController() {
		System.out.println("Home Controller");
	}
	
	 @Autowired
	 private StudentService service;
	 @Autowired
	 private EmployeeService eservice;
	
	@RequestMapping("login")
	public String LoginPage() {
		
		
		return "login";
	}
	
	@RequestMapping("reg")
	public String RegisterPage() {
		return "register";
	}
	
	@RequestMapping("regem")
	public String registerEmp() {
		return "registeremp";
	}
	@RequestMapping("submitemp")
	public String registerEmpl(@ModelAttribute Employee e)
	{
		System.out.println(e);
		eservice.saveEmployee(e);
		return"login";
	}
	
	@RequestMapping("log")
	public String LoginCheck(@RequestParam("uname")String uname, @RequestParam("pass")String pas,Model map) {
		
		if(uname.equals("admin")&&pas.equals("admin1"))
		{
			List<Student> student = service.selectAllStudent(uname, pas);
			map.addAttribute("data",student);
			return "success";
		}
		else
		{
			return"login";
		}
	}
	@RequestMapping("delete")
	public String deleteStudent(@RequestParam int rollno,ModelMap map) {
		
		List<Student> list=service.deletestudent(rollno);
		map.addAttribute("data",list);
		return "success";
	}
	@RequestMapping("edit")
	public String editStudent(@RequestParam int rollno,Model m) {
		
		Student s=service.editStudent(rollno);
		m.addAttribute("data", s);
		return "editpage";
	}
	@RequestMapping("add")
	public String addStudent() {
		
		return "register";
	}
	@RequestMapping("updateStudent")
	public String updateStudentdata(@ModelAttribute Student s,ModelMap map) {
		System.out.println("updateStudentdata method");
		System.out.println(s);
		service.saveStudent(s);
		List<Student> student =service.selectAllStudent("rr", "rrr");
		
		map.addAttribute("data",student);
		return"success";
	}
	@RequestMapping("submit")
	public String RegisterPageSubmit(@ModelAttribute Student stu,ModelMap map) {	
		List<Student> student = service.selectAllStudent("rr", "rrr");
		service.saveStudent(stu);
		map.addAttribute("data",student);
		return "success";
		
	}
}
