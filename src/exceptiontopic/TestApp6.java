package exceptiontopic;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		A objA = new B();

		C objC = (C)objA;// ClassCastException

/*
   		if (objA instanceof B) 
		{
			B objB = (B)objA;
		}else if(objA instanceof C)
		{
			C objC = (C)objA;
		}

 */ 
  
  	}
 
}
