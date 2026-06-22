package polymorphism.runtime.upcastinganddowncasting;

public class School extends Person
{
	public void getBehave() 
	{
		System.out.println("School - getBehave() : Student Behaviour");
	}
	public void getExamResult() 
	{
		System.out.println("School - getExamResult() : Student Exam Result");
	}
}
