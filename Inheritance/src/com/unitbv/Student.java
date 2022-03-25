package com.unitbv;

public class Student extends Person{

	private String nameOfUniversity;

	public Student(int age, String name, String nameOfUniversity) {
		super(age, name);
		this.nameOfUniversity = nameOfUniversity;
	}
	
	public void showStudent(){
		System.out.println(name+" "+age+" "+nameOfUniversity);
	}
}
