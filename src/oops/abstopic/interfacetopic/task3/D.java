package oops.abstopic.interfacetopic.task3;

// Multiple Inheritance
public class D implements A , B
{
	@Override
	public void addFun() 
	{
		System.out.println("D : addFun()");
	}
	@Override
	public void subFun() 
	{
		System.out.println("D : subFun()");
	}
	public static void main(String[] args) 
	{
		D obj = new D();
		
		obj.addFun();
		obj.subFun();
		
		B.test1();
		
		B objB = new D();
		objB.test2();
	}
}
