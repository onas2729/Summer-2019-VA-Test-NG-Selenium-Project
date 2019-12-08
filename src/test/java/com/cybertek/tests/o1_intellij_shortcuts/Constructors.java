package com.cybertek.tests.o1_intellij_shortcuts;

public class Constructors {
public Constructors() {
		System.out.print("Erhan ");
	}
public Constructors(int a) { // Erhan Ali
	this(); // Erhan
	
	System.out.print("Ali "); // Ali
}

public Constructors(double a) {
	this(100);
	
	System.out.print("Shawkrat ");
	// this(10); constructor call MUST be the first step
}

public Constructors(boolean a) {
	this (2.5);
	System.out.print("Dinara ");
}

public Constructors (String str ) {
	this (100);
	System.out.print("Seyfo ");
}

public static void main(String[] args) {
	
	
//	Constructors obj=new Constructors("Hello"); // Erhan Ali Seyfo 
//	Constructors obj=new Constructors(10>9);	// Erhan Ali Shawkrat Dinara 
// 	Constructors obj=new Constructors(100);		// Erhan Ali 
	Constructors obj=new Constructors(10.5);	// 
//	Constructors obj=new Constructors("Hello");
	
}
}
