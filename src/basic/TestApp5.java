package basic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		int a[][] = new int[3][];

		a[0] = new int[5];
		a[1] = new int[3];
		a[2] = new int[4];

		System.out.println(a.length);
		
		System.out.println("a[0].length : " + a[0].length);
		System.out.println("a[1].length : " + a[1].length);
		System.out.println("a[2].length : " + a[2].length);
		
		Scanner sc = new Scanner(System.in);
		
		// i - student
		for (int i = 0; i < a.length; i++) 
		{
			// j = Subjects
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		// i - student
		for (int i = 0; i < a.length; i++) 
		{
			// j = Subjects
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a[i][j]);
			}
		}
	}
}