package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Student {
	
	private String uname;
	private String pass;
	@Id
	private int  rolllno;
	private String name;

	
	
	private long mobileno;
	
	
	
	
	@Override
	public String toString() {
		return "Student [uname=" + uname + ", pass=" + pass + ", rolllno=" + rolllno + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getRolllno() {
		return rolllno;
	}
	public void setRolllno(int rolllno) {
		this.rolllno = rolllno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
}
