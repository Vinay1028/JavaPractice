abstract class Bike{
	abstract void run();
}
class Splendor extends Bike{
	void run()
	{
		System.out.println("this is the implementation of abstract method run");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Bike b = new Splendor();
		b.run();

	}

}
