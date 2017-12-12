package com.example.demo.entity;

public class User {

	private int id;
	private String name;
	private String email;
	
	public User(int id, String name, String email) {

		this.setId(id);
		this.setName(name);
		this.setEmail(email);

	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(Object object, String name2, Object email2) {
		this.setId(Integer.parseInt(object.toString()));
		this.setName(name2);
		this.setEmail(email2.toString());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
