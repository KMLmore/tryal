package com.cjc.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer
{
	@Id
	private int cid;
	private String cname;
	private String address;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Product> prodList;
	
	
//setter getter
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Product> getProdList() {
		return prodList;
	}
	public void setProdList(List<Product> prodList) {
		this.prodList = prodList;
	}
	
	

}
