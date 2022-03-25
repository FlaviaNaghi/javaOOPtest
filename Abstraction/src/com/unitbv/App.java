package com.unitbv;

/**
 * Abstract classes will hold common functionality 
 *		for all classes that extend it
 *	
 *	For example: all animals move and breathe and reproduce 
 *			so these can be put into the Animal Class
 * 
 * 	abstract keyword:
 * 		- we can have abstract methods in an abstract class: methods
 * 				without body
 * 		- if there is one abstract method: the class should be abstract as well
 * 		- ABSTRACT CLASSES CANNOT BE INSTANTIATED
 * 		- a class must inherit it to be able to use it
 * 			This class must implement the abstract methods in the 
 * 				parent class 
 * 
 */

/**INTERFACE
 * Like a class: a collection of abstract methods
 * 		A class can 'implements' an interface
 * 			~ inheriting the methods of the interface
 * 		
 * 					CONTAINS BEHAVIOR OF A CLASS
 * 
 * 		- it can have as many methods as we want
 * 		- no implementation
 * 		- we can not instantiate an interface
 * 		
 * 		Why is it good?
 * 			Because a class can extends a single class
 * 				BUT can implements several interfaces
 * 
 */


public class App {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.calculateArea();
		Shape.calculatePerimeter();
	}
}
