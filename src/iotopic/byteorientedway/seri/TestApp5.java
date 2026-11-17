package iotopic.byteorientedway.seri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Rahul", 10, 90);
		Student s2= new Student(2, "Ankur", 11, 80);
		Student s3= new Student(3, "Ganesh", 12, 100);
		Student s4= new Student(4, "Jay", 10, 80);
		Student s5= new Student(5, "Sagar", 11, 60);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		try
			(
				FileOutputStream fout = new FileOutputStream("royallist.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(list);
			
			System.out.println("sucess");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}