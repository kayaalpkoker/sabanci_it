package edu.sabanciuniv.it524;

import java.time.Clock;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MainClass {

	public static void main(String[] args) {
		
/*
 * Modifiers:
 * > access modifiers
 * 		> public
 * 		> private
 * 		> protected
 * > non-access modifiers
 * 		> final
 * 		> static
 * 		> abstract
 * 
 * Classes can be:
 * 		> public
 * 		> final, abstract
 * Variables can be:
 * 		> public, private, protected
 * 		> final, static
 * Methods can be:
 * 		> public, private, protected
 * 		> final, abstract, static
 */
		

				
/*
 * Keywords: public-private
 * 
 * public and private keywords are access modifiers, which control the access level of the code.
 * public > The code is accessible for all classes
 * private > The code is only accessible within the declared class
 * 
 * 
 * 
 * Keyword: final
 * 
 * Effects of final on:
 * > Class
 * 		> Class cannot be inherited by other classes
 * 		> Purpose: To prevent inheritance and polymorphism on a class
 * > Method
 * 		> Method cannot be overridden/modified
 * > Variable
 * 		> Variable cannot be overriden/modified
 *  
 * 
 * 
 * Keyword: static
 * 
 * The static keyword is a non-access modifier, and is mainly used for memory management.
 * The static keyword can be applied to: Variables, methods, blocks and nested classes.
 * 
 * The static keyword is used to indicate that a member (method or variable) belongs to a class, 
 * rather than to an instance of the class.
 * 
 * When a variable is declared as static, it means that the variable is shared by all instances of the class, 
 * rather than being unique to each instance. This means that only one copy of the variable exists.
 * 
 * When a method is declared as static, it means that the method can be called directly from the class, 
 * rather than from an instance of the class. Static methods can only access static variables and other 
 * static methods of the class.
 * 
 * 
 * 
 * 
 * 
 * OOP PRINCIPLES
 * >>
 * 
 * ABSTRACTION
 * This principle is about reducing complexity by hiding unnecessary details and providing a simplified 
 * interface for interacting with an object. Abstraction is achieved by using abstract classes and interfaces.
 * 
 * 
 * Keyword: abstract
 * 
 * The abstract keyword is used to achieve abstraction principle of OOP.
 * 
 * It is applied to classes and methods.
 * Class > cannot be used to create objects
 * Method > can only be used in an abstract class, and it does not have a body
 * 
 * An abstract class or method allows the developer to define a common interface (e.g abstract Engine class) for a 
 * group of related classes (e.g. concerete Engine class), without providing a complete implementation (instance 
 * creation) for all of the classes.
 * 
 * This allows the developer to implement the common functionality in a single place, and allows the user of 
 * the class to interact with the class (using Car class, which contains methods that use the Engine instances) 
 * without needing to know the implementation details.
 * 
 * An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass.
 * 
 * 
 * 
 * 
 * Abstract class vs Interface
 * 
 * Abstract classes should be used primarily for objects that are closely related, whereas interfaces are best 
 * suited for providing a common functionality to unrelated classes.
 * 
 * Abstract classes provide you the flexibility to have certain concrete methods and some other methods that the 
 * derived classes (subclasses) should implement.
 * By contrast, if you use interfaces, you would need to implement all the methods in the class that extends 
 * the interface. An abstract class is a good choice if you have plans for future expansion.
 * 
 * 
 * 
 * ENCAPSULATION
 * This principle is used to hide the internal details of an object from the outside world.
 * This helps to protect the data and behavior of an object from unwanted modifications.
 * 
 * Encapsulation is achieved via:
 * a. declare class fields/methods as private, to restrict access
 * b. provide public get and set methods to access and update the value of a private variable
 * 
 * 
 * 
 * 
 * INHERITANCE
 * This principle allows classes to inherit properties and methods from other classes, creating a 
 * hierarchy of classes.
 * This helps to reduce code duplication and allows for more efficient code reuse.
 * 
 * 
 * 
 * 
 * POLYMORPHISM
 * Polymorphism refers to the ability of an object to take on many forms.
 * This principle allows objects of different classes to be treated as objects of a common superclass or 
 * interface. This allows for more dynamic and flexible code, as well as code that is less tightly coupled.
 * 
 * 
 * Polymorphism için gerekli:
 * 1) Inheritance (Superclass ve subclass'lar)
 * 2) İlgili superclass metodunun subclass'ta override edilmeli
 * 3) Superclass'a ait bir referans ile subclass'a ait bir obje yaratılmalı
 * 		> Calisan calisan2 = new YariZamanliCalisan (...)
 * 		> Calisan calisan3 = new SozlesmeliCalisan (...)
 * 			> calisan2.calis --> Calisan class'ında tanımlanmış, YariZamanli class'ında 
 * 			  override edilmiş "calis" metodu gelir (çünkü ref Calisan class'ı ve obje ise YariZamanli class'ı)
 * 4) Objesi subclass'a ait olan superclass referansı ile override edilmiş subclass metodu çağrılmalı
 * 
 *  
 * >Type casting
 * Animal cat2 = new Cat();
 * ((Cat)cat2).catMethod();
 * When you create an object of type Animal and assign it to a reference of type Animal, 
 * the reference can only access methods that are defined in the Animal class or overridden 
 * in the Cat class. In other words, the reference is only aware of the methods that are defined 
 * in the type it's declared as.
 * 
 * 
 * 
 * Inheritance vs Abstraction
 * 
 * These OOP principles are used for different purposes.
 * 
 * Inheritance is a mechanism that allows a new class to inherit properties and methods from an existing class. 
 * This allows for code reuse and a clear hierarchy of classes. For example, a "Cat" class could inherit properties 
 * and methods from a more general "Animal" class.
 * 
 * Abstraction, on the other hand, is the process of hiding the implementation details of an object and only showing 
 * the necessary information to the user. This allows for the creation of more flexible and modular code. 
 * For example, a "Car" class could have an "Engine" 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * STACK-HEAP (obje nerede yaratılıyor, neden) - garbage collector
 *
 * In Java, references to objects are typically stored on the stack, while the actual objects are stored in the heap.
 * 
 * When a variable is declared in a Java program, it is given a memory location on the stack. If the variable is an 
 * object reference, it points to the memory location on the heap where the object is stored.
 * 
 * When a new object is created in Java, the memory for that object is allocated on the heap. The heap is a global 
 * memory shared by all threads, it is used to store the actual state of an object. The heap is managed by the 
 * JVM (Java Virtual Machine) and is responsible for allocating and deallocating memory for objects as they are 
 * created and destroyed.
 * 
 * The reason for this separation is that the stack memory is faster to access and has a limited size, it is 
 * thread-specific, and the memory is released when the method completes execution. While the heap memory is slower 
 * to access but has a larger size and is global, it is used to store the actual state of an object, and the memory 
 * is released only when the object is no longer in use and eligible for garbage collection.
 * 
 * This way, references to objects are stored in stack memory and the objects themselves are stored in heap memory. 
 * This allows for faster access to references, while still providing a mechanism for managing the lifecycle of 
 * objects through garbage collection.
 * 
 * 
 * 
 * 
 * 
 * 
 * Design pattern: Singleton
 * 
 * 1. Create a public-static field with class-object type
 * 		> public static Student onlyStudent;
 * 2. Create a private constructor
 * 3. Create a public-static createObject() method to create objects, which controls if a single object already exists
 * 
 * 
 */
		
		
		
		//Deneysel
		Clock clock = Clock.systemDefaultZone();
		Instant instant = clock.instant();
		ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, clock.getZone());
		String time = zdt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		System.out.println(zdt);
		System.out.println(time);
				
		
		
		
		
	}

}
