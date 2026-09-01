package stringtopic.immutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		System.out.println("2. By 'new' keyword Way:-");
		System.out.println("-----------------------------------------------------");

		String name8 = new String("royal");
		String name9 = new String("royal");	
		String name10 = name8;
		String name11 = new String("technosoft");	

//	Object Equality:-
//	-------------------
			
			System.out.println("1. referenceBased(references)");			
			System.out.println("-----------------------------");			
			System.out.println("(name8==name9) : " + (name8==name9));	// false		                
			System.out.println("(name8==name10) : " + (name8==name10));//true			                
			System.out.println("(name8==name11) : " + (name8==name11));// false      
			System.out.println("(name9==name10) : " + (name9==name10));// false
			System.out.println("(name9==name11) : " + (name9==name11));// false                         
			System.out.println("(name10==name11) : " + (name10==name11));// false		
				
			System.out.println("2. valueBased(values)");	
			System.out.println("---------------------");
			System.out.println("(name8.equals(name9)) : " + (name8.equals(name9)));// true			
			System.out.println("(name8.equals(name10)) : " + (name8.equals(name10)));// true			
			System.out.println("(name8.equals(name11)) : " + (name8.equals(name11)));// false       
			System.out.println("(name9.equals(name10)) : " + (name9.equals(name10)));// true       
			System.out.println("(name9.equals(name11)) : " + (name9.equals(name11)));// false       
			System.out.println("(name10.equals(name11)) : " + (name10.equals(name11)));// false      
	}
}