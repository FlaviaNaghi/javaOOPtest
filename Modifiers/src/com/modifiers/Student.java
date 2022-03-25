package com.modifiers;

public class Student {

	private int age;//variabila de instanta(apartine obiectului)
	public Student(int i) {
		// TODO Auto-generated constructor stub
	}
	private void Student(int age) {
		// TODO Auto-generated method stub
		this.age=age;
		//System.out.println(age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		this.age = age;
	}
	
}
