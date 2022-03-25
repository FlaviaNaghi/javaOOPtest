package com.modifiers;

/* Access modifiers
* 	
*  1.) no modifier (it is called default): visible to the package including same class
*  2.) private: visible to the class exclusively
*  3.) public: visible to any class / "open to the world"
*  4.) protected: visible to the package and all subclasses 
* 
* Non-access modifiers
* 
* 	static -> these are the class variables
* 		It can be accessed during the entire run of the program
* 			"static memory allocation": static variables are allocated
* 					in compile time (before running the application)!!!
*/

public class App {

	public static void main(String[] args) {
		
		Student s = new Student(21);
		System.out.println(Constants.SIMULATION_TIME);
	}
}
