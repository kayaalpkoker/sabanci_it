package edu.sabancuniv.it524.exceptionhandling;

public class Calculator {
	
	
	
	public int bolme(int x,int y) throws AhmetException
	{
		if (x == 1 || y == 1)
		{
			throw new AhmetException("Bölmem !! ");
		}
		
		return x / y;
			
	}

}
