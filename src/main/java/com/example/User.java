package com.example;

public class User {
	private String name;
	private Integer age;
	private String adress;
	
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", adress=" + adress + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
}
