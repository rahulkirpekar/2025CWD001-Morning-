package polymorphism.runtime.upcastinganddowncasting;

public class PublicPlace extends Person
{
	public void getBehave() 
	{
		System.out.println("PublicPlace - getBehave() : Citizen Behaviour");
	}
	public void getPublicEvent() 
	{
		System.out.println("PublicPlace - getPublicEvent() : Citizen Public Event");
	}
}
