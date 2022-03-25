package com.unitbv;

public interface Shape {

	public abstract void calculateArea();
	public static void calculatePerimeter(){
		System.out.println("perimeter calculated");
	}
}
