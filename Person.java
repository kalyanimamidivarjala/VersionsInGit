package com.collections;

public class Person {
	private String firstname;
	private String lastname;
	private Long phno;
	private Float height;
	private Integer age;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person(String firstname, String lastname, Long phno, Float height, Integer age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phno = phno;
		this.height = height;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", phno=" + phno + ", height=" + height
				+ ", age=" + age + "]";
	}
	
	

}
