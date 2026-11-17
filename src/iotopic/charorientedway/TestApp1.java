package iotopic.charorientedway;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Ways to write and read
//-------------------------
// 1. Byte oriented way--image,pdf,doc,excel,String
// 2. Character oriented way---text Data --write/read
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		
		// AutoClosable Resource
		try
			(
					// File / Socket / Database  Connection
				FileWriter fw = new FileWriter("records.txt");
			)
		{
			fw.write(name);
		
			System.out.println("sucess");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
