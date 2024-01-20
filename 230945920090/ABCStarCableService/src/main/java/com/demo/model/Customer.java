package com.demo.model;

public class Customer {
	private String cno;
	private String basepack;
	private String optpack;
	public Customer() {
		super();
	}
	public Customer(String cno, String basepack, String optpack) {
		super();
		this.cno = cno;
		this.basepack = basepack;
		this.optpack = optpack;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getBasepack() {
		return basepack;
	}
	public void setBasepack(String basepack) {
		this.basepack = basepack;
	}
	public String getOptpack() {
		return optpack;
	}
	public void setOptpack(String optpack) {
		this.optpack = optpack;
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", basepack=" + basepack + ", optpack=" + optpack + "]";
	}
	
}
