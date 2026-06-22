package polymorphism.compiletime;

// Method Overloadding
//--------------------
public class TestApp1 
{
	public void addFun(short no1,short no2) 
	{
		System.out.println("addFun(short no1,short no2) : " + (no1+no2));
	}
	
	public void addFun(double no1,double no2) 
	{
		System.out.println("addFun(double no1,double no2) : " + (no1+no2));
	}
	
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(int no1,int no2,int no3) : " + (no1+no2+no3));
	}

	public void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4) : " + (no1+no2+no3+no4));
	}

	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		
		obj.addFun('A', 'B');
	}
}
/*
FilterBased on Class:-
---------------------
	1. argument count
	2. datatype match
	3. Type pramotion Rule
	
	
	
	Type pramotion Rule:-
	------------------------
	boolean -- X
	
					
					byte
					 |
					short
					 |
char--------------->int
					 | 	
					long
					 |
					float
					 |
					double
					

*/



