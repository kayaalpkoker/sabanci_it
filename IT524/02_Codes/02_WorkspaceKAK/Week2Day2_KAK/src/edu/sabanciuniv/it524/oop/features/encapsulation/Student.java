package edu.sabanciuniv.it524.oop.features.encapsulation;

public class Student {

	private int id;           //Encapsulation için id'nin access specifier'ını private yaptım 
	public String name;
	public String lastName;
	public double it501Grade;
	public double it524Grade;
	

	public Student(int id, String name, String lastName, double it501Grade, double it524Grade) {
		// 
		if (id > 100) {
			this.id = -1;
		}
		else {
			this.id = id;
		}
		
		this.name = name;
		this.lastName = lastName;
		this.it501Grade = it501Grade;
		this.it524Grade = it524Grade;
	}
	
	public int getId() {   //get() methodunu println muadili olarak, bilgi göstermek amacıyla yaratıyorum
		return this.id;
	}
	
	public void setId(int id) {  //set() methodunu değer değiştirebilmek için yaratıyorum (belli parametreleri sağlarsa değer değiştirebilmek)
		if (id>100)
		{
			this.id = -1;
		}
		else {
			this.id = id;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;	
	}

}
