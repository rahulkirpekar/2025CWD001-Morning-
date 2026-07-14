package oops.abstopic.task1;

// abstract class
public abstract class A 
{
	// 1. Data Members
	int no1;
	
	// 2. Constructors
	public A()
	{
		no1 = 100;
		System.out.println("A : Default Constructor");
	}
	// 3. Member Function
	// 1. Abstract method
	public abstract void test1(); 
	public abstract void test2();
	public abstract void test3();
	
	// 2. Non-Abstract method
	public void test4() 
	{
		System.out.println("A : test4()");
	}
}
