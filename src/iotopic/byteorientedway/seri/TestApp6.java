package iotopic.byteorientedway.seri;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		try
			(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2025CWD001(Morning)\\royallist.txt");
				
				ObjectInputStream oin  = new  ObjectInputStream(fin);
			)
		{
			ArrayList<Student> list = (ArrayList<Student>)oin.readObject();

			for (int i = 0; i < list.size(); i++) 
			{
				Student s = 	list.get(i);
				
				System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
			}
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}