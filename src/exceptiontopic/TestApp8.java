package exceptiontopic;

import java.util.Scanner;

public class TestApp8 
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
			
			String name = "";
			int length = name.length();// NullPointerException
			System.out.println("length of String : " + length);
			
			int a[] = new int[5];// a[0]...a[4]
			a[5] = 100;// ArrayIndexOutofBoundException
			System.out.println("A[5] : " + a[5]);
			
			
			String value = "abc123";// String---int
			int no = Integer.parseInt(value);// NumberFormatException
			System.out.println(no+200);// 323
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception Handled : " + e.getMessage());
		}
		catch(NullPointerException e) 
		{
			System.out.println("Exception Handled : " + e.getMessage());
		}	
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception Handled : " + e.getMessage());
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Exception Handled : " + e.getMessage());
		}
		catch(Exception e) 
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
