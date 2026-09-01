package exceptiontopic;

import java.util.Scanner;

public class TestApp10 
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

		int ans = 0;
		
		try 
		{
			ans = no1 / no2; // abnormal scenario --code crashed
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("I am Finally Block");
		}
		
		System.out.println("Addition : " + ans);
		
		System.out.println("Statement---6 ");
		System.out.println("Statement---7 ");
		System.out.println("Statement---8 ");
		System.out.println("Statement---9 ");
		System.out.println("Statement---10");
	}
}
