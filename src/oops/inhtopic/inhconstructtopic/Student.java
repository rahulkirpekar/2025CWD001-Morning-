package oops.inhtopic.inhconstructtopic;

public class Student extends Person
{
	int rno;
	int std;
	int marks;
	
	public Student() 
	{
		System.out.println("Student - Default Constructor");
	}
	public Student(int rno, String name,int std, int marks) 
	{
		super(name);
		this.rno = rno;
		this.std = std;
		this.marks = marks;
		System.out.println("Student - FOUR-ARG Constructor");
	}
	public void dispData() 
	{
		System.out.println(rno +" " + name + " " + std +" " + marks);
	}
}
