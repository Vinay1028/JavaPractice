interface Print{
	void print();
}
interface Showables extends Print{
	void show();
}
public class InterfaceInheritance implements Print, Showables{
	public void print()
	{
		System.out.println("Implementation of print");
	}
	public void show()
	{
		System.out.println("Implementation of show");
	}
	public static void main(String[] args) {
		Print p = new InterfaceInheritance();
		Showables s = new InterfaceInheritance();
		p.print();
	//	p.show();    compile time error
		s.show();
	//  s.print();   compile time error
		InterfaceInheritance i = new InterfaceInheritance();
		i.print();
		i.show();
		
	}

}
