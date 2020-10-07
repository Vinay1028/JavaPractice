package OOPsPractice;

interface I
{
	void sum();
}

interface B
{
	void sum();
}

public class te implements I, B {
	public void sum()
	{
		System.out.println("name");
	}
	
	public void vis()
	{
		System.out.println("vishal");
	}
	public static void main(String[] args)
	{
		te t = new te();
		t.sum(); 
		I i = new te();
		i.sum();
		B b = new te();
		b.sum();
	}
}
