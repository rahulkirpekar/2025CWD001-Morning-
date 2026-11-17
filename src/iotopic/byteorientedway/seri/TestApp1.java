package iotopic.byteorientedway.seri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Data == Object
		Student s1 = new Student(1, "Ankur", 10, 100);

		// Auto-Closable Resource
		try
			(
					FileOutputStream fout = new FileOutputStream("recordsclub.txt");
					
					ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			
			out.writeObject(s1);
			
			System.out.println("sucess");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
