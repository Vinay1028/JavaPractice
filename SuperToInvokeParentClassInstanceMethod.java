class Animall{
	void run() {
		System.out.println("Running....");
	}
}
class Dogg extends Animall{
	void run()
	{
		System.out.println("Running on Road.");
	}
	
	void eat() {
		System.out.println("Eating....");
	}
	void behaviour() {
		super.run();
		eat();
		run();
	}
}
public class SuperToInvokeParentClassInstanceMethod {

	public static void main(String[] args) {
		Dogg d = new Dogg();
		d.behaviour();
		

	}

}
