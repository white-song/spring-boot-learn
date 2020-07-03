package com.white.learn.model;


import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 6989010590557274267L;

	private Long id;
	private String name;
	private int age;
	private String pass;

	public User() {}

	public User(String name, int age, String pass) {
		this.name = name;
		this.age = age;
		this.pass = pass;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", pass='" + pass + '\'' +
				'}';
	}
}
