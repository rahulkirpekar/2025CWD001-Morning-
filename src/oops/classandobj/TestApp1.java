package oops.classandobj;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Student--reference variable type
		// obj---reference variable
		// new ---keyword
		// Student()---Create Object of Student
		Student obj1 = new Student();
		Student obj2 = new Student();
		Student obj3 = new Student();
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println("obj3 : " + obj3);
		
		obj1.scanData();
		obj2.scanData();
		obj3.scanData();
		
		obj1.dispData();
		obj2.dispData();
		obj3.dispData();
	}
}
