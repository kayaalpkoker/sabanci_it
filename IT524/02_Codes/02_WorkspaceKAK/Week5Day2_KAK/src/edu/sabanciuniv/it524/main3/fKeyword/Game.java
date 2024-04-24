package edu.sabanciuniv.it524.main3.fKeyword;

//"final" keyword sebebiyle extend edilemeyen class
public final class Game {

	/*
	 * The main purpose of creating a final class is to prevent inheritance and polymorphism on that class.
	 * 
	 * 1. Preventing Inheritance: When a class is declared as final, it cannot be subclassed, meaning that no other class can extend it. This can be useful in cases where the developer does not want any other class to inherit the properties or methods of the final class, for example, when a class contains sensitive information that should not be exposed.
	 * 
	 * 2. Security: Final classes can be used to ensure that a class cannot be subclassed by malicious code, which can be a security concern.
	 * 
	 * 3. Performance: The JVM (Java Virtual Machine) can optimize the execution of final classes and methods, since it knows that the class or method cannot be overridden. This can result in improved performance.
	 * 
	 * 4. API Design: Sometimes a class is designed to be a utility class with static methods, we do not want to instantiate the class, in that case, making the class final is a good option.
	 */
	
	
}
