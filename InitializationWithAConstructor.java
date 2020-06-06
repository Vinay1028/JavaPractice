class Student1
{
	int id;
	String name;
	Student1(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}
public class InitializationWithAConstructor {

	public static void main(String[] args) {
		Student1 s = new Student1(20,"Shrishti");
		System.out.println(s.id);
		System.out.println(s.name);

	}

}
