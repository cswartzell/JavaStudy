package com.bean;

//A bean boi. Means ALL vars are private, all methods are public AND have get and set

public class Product {
	private int pid;
	private String pname;
	private float price;
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
	public float getPrice() {
		return price;
	}
	public Product() {
		super();
	}
	public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
