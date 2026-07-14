package oops.abstopic.interfacetopic.task3;

public interface B 
{
	public abstract void addFun();
	public abstract void subFun();
	
	
	static void test1() 
	{
		System.out.println("B : test1()");		
	}
	default void test2() 
	{
		System.out.println("B : test2()");		
		test3();
	}
	private void test3() 
	{
		System.out.println("B : test3()");		
	}
}
