package edu.sabanciuniv.it524.genericclass;

public class MainClass2 {

	public static void main(String[] args) {
		
		//Box class ı bir "Generic Class" tır
		//Class'ı "Box<T>" olarak yarattığım için, objesini hangi tipe uygun yaratmak istiyorsam adapte ediyorum
		//		> Box<Student>, Box<Integer>, Box<String>, vs.
		Box<Student> stuBox = new Box<>();
		
		Student s = new Student("Albert","aaa");
		stuBox.kutuyaEkle(s);
		
		Student s2 = stuBox.kutudaNevar();
		
		
		Box<Integer> intBox = new Box<>();
		
		intBox.kutuyaEkle(123);
	
		int x = intBox.kutudaNevar();
		
		
	}

}
