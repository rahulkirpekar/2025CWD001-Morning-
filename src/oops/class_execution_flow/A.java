package oops.class_execution_flow;

public class A 
{
	// static Block
	static 
	{
		System.out.println("A : static Block--1");
	}
	
	static 
	{
		System.out.println("A : static Block--2");
	}

	// Instance Block
	{
		System.out.println("A : Instance Block--1");
	}
	
	{
		System.out.println("A : Instance Block--2");
	}
	
	// Default Constructor
	A()
	{
		System.out.println("A : Default Constructor");
	}
	
	A(int no)
	{
		System.out.println("A : PARA(ONE Arg) Constructor");
	}
	
	// static Method
	public static void staticMethod() 
	{
		System.out.println("A :  static Method()");
	}
	
	// Non-Static Method
	public void nonStaticMethod() 
	{
		System.out.println("A :  Non-Static Method()");
	}
	public static void main(String[] args) 
	{
		System.out.println("------------START :: Main Function--------------");
		
		A.staticMethod();
		
		A obj1 = new A();
		A obj2 = new A(100);
		
		obj1.nonStaticMethod();
		
		System.out.println("------------EXIT :: Main Function--------------");
	}
}

/*

A : static Block--1
A : static Block--2
------------START :: Main Function--------------
A :  static Method()

Obj1 Creation Process:-
	1.Dm's Memory Allocation
	2.JVM Default Constructor
	3.Instance Block--1
	4.Instance Block--3
	5.Default Construtcor

Obj2 Creation Process:-
	1.Dm's Memory Allocation
	2.JVM Default Constructor
	3.Instance Block--1
	4.Instance Block--3
	5.Para Construtcor


Obj1---->A :  Non-Static Method()
	
------------EXIT :: Main Function--------------

*/
