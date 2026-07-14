package oops.abstopic.interfacetopic.task1;

public interface A 
{
//	1.Constant Variables--"public static final"
//	--------------------------------------------
		int NO1 = 10;// public static final 
		public static int NO2 = 10;// final 
		public  final int NO3 = 10;// static 
		static final int NO4 = 10;// public 
		public static final int NO5 = 10;

//	2. Methods:-
//	------------
//		===> Abstract Methods(public abstract)---Rules
		void test1();// public abstract
		public void test2();// abstract
		abstract void test3();// public 


//		===> Non-Abstract Methods(static(8),default(8),private(9))

		static void test4()
		{
			System.out.println("A--interface : test4()");
		}
		default void test5()
		{
			test6();
			System.out.println("A--interface : test5()");
		}
		private void test6()
		{
			System.out.println("A--interface : test6()");
		}
}
