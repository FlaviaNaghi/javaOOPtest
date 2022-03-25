package com.classes;

public class Student {

	private int age;

	public Student(int age) {
		this.age = age;
		System.out.println(age);
	}
	
	
	public Student() {
		super();
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
