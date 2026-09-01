package exceptiontopic;

import java.util.Scanner;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		System.out.println("Statement---1");
		System.out.println("Statement---2");
		System.out.println("Statement---3");
		System.out.println("Statement---4");
		System.out.println("Statement---5");

		int ans= 0;
		
		// Exception Handling -- try..catch
		
		try 
		{
			ans = no1 / no2; // abnormal scenario --code crashed	
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception Handled : " + e.getMessage());
		}

		System.out.println("Addition : " + ans);
		
		System.out.println("Statement---6 ");
		System.out.println("Statement---7 ");
		System.out.println("Statement---8 ");
		System.out.println("Statement---9 ");
		System.out.println("Statement---10");
	}
}
