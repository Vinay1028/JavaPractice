abstract  class AbstractClass {
	abstract void display();
}

public class MyClass extends AbstractClass{
	void display()
	{
		System.out.println("Abstract method implementation");
	}
	public static void main(String[] args)
	{
		AbstractClass a = new MyClass();
		a.display();
	}
}