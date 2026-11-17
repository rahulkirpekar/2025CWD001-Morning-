package iotopic.byteorientedway.seri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[3];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		// Data -- student array--->s
		try
			(
				FileOutputStream fout= new FileOutputStream("listA.txt");
				
				ObjectOutputStream out  =new ObjectOutputStream(fout);
			)
		{
			// write array into file
			out.writeObject(s);
			
			System.out.println("success");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
