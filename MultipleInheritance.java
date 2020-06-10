interface Printablee{
	void print();
}
interface Showable
{
	void show();
}
public class MultipleInheritance implements Printablee, Showable {
	public void print() {
		System.out.println("Implementation of print method of printable interface");
	}
	public void show()
	{
		System.out.println("Implementation of show method of Showable interface in java");
	}

	public static void main(String[] args) {
		Printablee p = new MultipleInheritance();
		Showable s = new MultipleInheritance();
		p.print();
		s.show();

	}

}
