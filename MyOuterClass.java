public class MyOuterClass{
	private int x;
	
	MyInnerClass inner = new MyInnerClass(); // An instance of Inner Class
	
	public void doStuff()
	{
		inner.go(); // Calling the method of inner class
	}
	
	class MyInnerClass{
		void go()
		{
			x = 42;
			System.out.println("x is:-" + x);
		}	
	}
}