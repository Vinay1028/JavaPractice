package OOPsPractice;
class Super{
	public void display()
	{
		System.out.println("Super class");
	}
}

class Sub extends Super{
	public void display()
	{
		System.out.println("Sub Class"); 
	}
}
public class OverridingDemo {
	public static void main(String[] args)
	{
		Super s = new Super();
		s.display();
		Sub su = new Sub();
		su.display();
		Super sup = new Sub();
		sup.display();
	}
}
