package com.cjc.model;

import javax.persistence.Entity;

public class Addres {

	@Override
	public String toString() {
		return "Addres [cityname=" + cityname + ", area=" + area + "]";
	}
	private String cityname;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	private String area;
}
