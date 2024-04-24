package edu.sabanciuniv.it524.oop.features.encapsulation;

public class Student {
	
	private int id;
	private String name;
	private String lastname;
	private double it501Grade;
	private double it524Grade;
	
	public Student(int id,String name,String lastname,double it501Grade,double it524Grade) {
		if (id >100)
		{
			this.id = -1;
		}
		else
		{
			this.id = id;
		}
			
		
		
		this.name = name;
		this.lastname = lastname;
		this.it501Grade = it501Grade;
		this.it524Grade = it524Grade;
	}
	
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		if (id >100)
		{
			this.id = -1;
		}
		else
		{
			this.id = id;
		}
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;

	}
	
	
	
	
	

}
