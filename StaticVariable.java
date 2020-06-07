
public class StaticVariable {
	int rollNo;
	String name;
	static String college = "KIET group of instituions";	//it is mainly used for memory management
															//it is same for all the objects of the class
	StaticVariable(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	public void display()
	{
		System.out.println(rollNo+" "+name+" "+college);
	}

	public static void main(String[] args) {
		StaticVariable s = new StaticVariable(21,"rohit");
		StaticVariable s1 = new StaticVariable(27,"anuj");
		s.display();
		s1.display();
	}

}
