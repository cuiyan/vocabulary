package com.grammerstore.entity;

public class DBUserPhilosopher {
	private Long id;
	private String philosopherName;
	private String userName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPhilosopherName() {
		return philosopherName;
	}
	public void setPhilosopherName(String philosopherName) {
		this.philosopherName = philosopherName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
