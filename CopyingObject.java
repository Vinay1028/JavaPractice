
public class CopyingObject {
	int id;
	String name;
	int age;
	public CopyingObject(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public CopyingObject(CopyingObject s)
	{
		this.id = s.id;
		this.name = s.name;
		this.age = s.age;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		CopyingObject c = new CopyingObject(25,"vibha",24);
		CopyingObject c1 = new CopyingObject(c); //passing the reference of first object to copy its values
		c.display();
		c1.display();

	}

}
