package exceptiontopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];// a[0]...a[4]
		
		a[5] = 100;// ArrayIndexOutofBoundException
		
		System.out.println("A[5] : " + a[5]);
	}
}
