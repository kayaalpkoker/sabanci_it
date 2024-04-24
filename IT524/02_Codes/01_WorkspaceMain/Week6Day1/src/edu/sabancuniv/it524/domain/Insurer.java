package edu.sabancuniv.it524.domain;

public class Insurer {
	
	private String insurerName;

	public Insurer(String insurerName) {
		super();
		this.insurerName = insurerName;
	}
	
	
	public void insure(Insurable insurable)
	{
		System.out.print(this.insurerName + " insuring -->");
		insurable.getInsured();
	}
	
	

}
