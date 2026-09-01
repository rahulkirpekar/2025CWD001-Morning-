package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp12 
{
	public static void isValidForVote(int age) throws IOException
	{
		if (age < 18) 
		{
			// Raise Exception
			//------------------
			
			// 1. check Exception(Compiletime--Compiler)
			throw new IOException("Invalid Age,\n\tPlease enter Valid Age for Vote.");
			
			// 2. Un-check Exception(Runtime---JVM)
//			throw new ArithmeticException("Invalid Age,\n\tPlease enter Valid Age for Vote.");
			
		} 
		else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	
		System.out.println("General Statement");
	}
}