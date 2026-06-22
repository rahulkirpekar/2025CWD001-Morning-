package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] a1 = new int[3][3];
		
		int rsum,csum = 0;
		
		int b[] = new int[3];
		
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
			rsum = csum = 0;
			for (int j = 0; j < a1[i].length; j++) 
			{
				csum += a1[i][j]; 
				rsum += a1[j][i]; 
				
				System.out.print("  "+a1[i][j]+"\t");
			}
			b[i] = rsum;
			System.out.println(" = "+csum);
			System.out.println();
		}
		
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.print(" = "+b[i]+"\t");
		}
	}
}