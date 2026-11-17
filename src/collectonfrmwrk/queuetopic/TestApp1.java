package collectonfrmwrk.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natural Ordering
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("rahul");
		queue.add("ankur");
		queue.add("ganesh");
		queue.add("kunal");
		queue.add("sagar");
		queue.add("jayant");
		
		while(!queue.isEmpty()) 
		{
			String name = queue.poll();
			
			System.out.println(name);
		}
	}
}
