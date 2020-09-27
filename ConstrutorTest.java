class A{
	A()
	{
		System.out.println("Super class constructor invoked");
		System.out.println(5+10);
	}
}

class B extends A{
	B()
	{
		System.out.println("Sub class constructor is invoked");
	}
}
public class ConstrutorTest {
    public static void main(String[] args)
    {
    	B a = new B();
    }
}
