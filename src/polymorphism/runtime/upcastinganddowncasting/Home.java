package polymorphism.runtime.upcastinganddowncasting;

public class Home extends Person
{
	public void getBehave() 
	{
		System.out.println("Home - getBehave() : Child Behaviour");
	}
	public void getMoviewOnTime() 
	{
		System.out.println("Home - getMoviewOnTime() : Child MovieTime.");
	}
}
