class Adder{
	void add()
	{
		System.out.println("adding the numbers.");
	}
}
public class Overriding extends Adder {
	
	int sum()
	{
		return 1;
	}
	public static void main(String[] args) {
		Overriding o = new Overriding();
		System.out.println(o.sum());

	}

}
