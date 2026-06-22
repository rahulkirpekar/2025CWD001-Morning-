package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
/*		
	2'D Array
	----------
		Array Declaration:-
		------------------
	int a[][] = new int[3][5];
	int[][] a = new int[3][5];
	int [][]a = new int[3][5];
	int [][] a = new int[3][5];
	int []a[] = new int[3][5];
	
	int []a[] = null;
	a = new int[3][5];

Array Declaration With initialisation:-
----------------------------------------
	int a[][] = 
				{
					{10,20,30,40,50},
					{11,21,31,41,51},
					{101,201,301,401,501},
				};

	int a[][] = new int[][]
						{
							{10,20,30,40,50},
							{11,21,31,41,51},
							{101,201,301,401,501}
						};		
*/		
//		int a[][] = new int[3][5];
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a1 = new int[3][5];
		
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a1[i][j]);
			}
		}
		
//		int [][]a2 = new int[3][5];
//		int [][] a3 = new int[3][5];
//		int []a4[] = new int[3][5];
		
//		int []a5[] = null;
//		a5 = new int[3][5];
		
		
//		int a6[][] = 
//					{
//						{10,20,30,40,50},
//						{11,21,31,41,51},
//						{101,201,301,401,501},
//					};
//
//		int a7[][] = new int[][]
//							{
//								{10,20,30,40,50},
//								{11,21,31,41,51},
//								{101,201,301,401,501}
//							};		
	}
}