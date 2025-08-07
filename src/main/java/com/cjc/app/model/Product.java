package com.cjc.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int pid;
	private String pname;
	private String color;
	private double price;

	public Product(int pid, String pname, String color, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.color = color;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
