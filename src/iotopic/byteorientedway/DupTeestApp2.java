package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TeestApp2 
{
	// 1.Byte oriented way--String Data
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter Nane : ");
		String name= sc.nextLine();// A   B  C
								   // 65 66 67---Byte values
		// Data -- name(String)---convert into byte
		
		FileOutputStream fout = null;
		try 
		{
			// 1. Open File Connection 
			fout = new FileOutputStream("royal.txt");
			
					// String convert into Byte.
			byte b[] = name.getBytes();
			
			
			for (int i = 0; i < b.length; i++) 
			{
				System.out.println(name.charAt(i)+"---"+b[i]);
			}
			
			// 2. Operation(Writting)
			fout.write(b);
			
			// 3. Close File Connection
			fout.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}