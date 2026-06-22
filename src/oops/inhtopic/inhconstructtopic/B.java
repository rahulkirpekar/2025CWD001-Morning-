package oops.inhtopic.inhconstructtopic;

// Single Inheritance
public class B extends A
{
	int no2;
	
	public B() 
	{
		System.out.println("B--Default Constructor");
	}
	public B(int no1,int no2) 
	{
		super(no1);
		System.out.println("B--TWO-PARA Constructor");
//		this.no1 = no1;
		this.no2 = no2;
	}
	
	void dispData() 
	{
		System.out.println("No1 : " + no1 +"\tNo2 : " + no2);
	}
}
