package oops.classandobj;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"Rahul Kirpekar",2122,"SE");
		
		Employee  e2 = new Employee(e1);
		
		e1.dispData();
		e2.dispData();
	}
}
