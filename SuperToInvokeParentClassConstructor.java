class Bird{
	Bird()
	{
		System.out.println("Bird is created");
	}
}
class Sparrow extends Bird{
	Sparrow()
	{
		super();         //if we not invoke the super compiler implicitly invokes it as the first line of Constructor of sub-class
		System.out.println("Sparrow is created.");
	}
}
public class SuperToInvokeParentClassConstructor {

	public static void main(String[] args) {
		Sparrow s = new Sparrow();

	}

}
