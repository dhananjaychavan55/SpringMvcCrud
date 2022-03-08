package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddres=" + eaddres + ", mobile=" + mobile + "]";
	}
	private String ename;
	private String eaddres;
	private String mobile;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddres() {
		return eaddres;
	}
	public void setEaddres(String eaddres) {
		this.eaddres = eaddres;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
