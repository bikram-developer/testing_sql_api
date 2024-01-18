package com.sql.api.entity;


public class TestEntity {

	private int id;
	
	private String name;
	
	private String location;
	
	private String age;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public TestEntity(int id, String name, String location, String age) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.age = age;
	}

	public TestEntity() {
	}
	
	
}
