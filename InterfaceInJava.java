interface printable{
	void print();
}
public class InterfaceInJava implements printable {
	public void print()
	{
		System.out.println("Inplementation of interface method print");
	}

	public static void main(String[] args) {
		printable p = new InterfaceInJava();
		p.print();

	}

}
