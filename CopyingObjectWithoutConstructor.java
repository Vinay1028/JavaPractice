
public class CopyingObjectWithoutConstructor {
	int id;
	String name;
	CopyingObjectWithoutConstructor(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	CopyingObjectWithoutConstructor(){}
	public void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		CopyingObjectWithoutConstructor c = new CopyingObjectWithoutConstructor(123,"shivam");
		CopyingObjectWithoutConstructor c1 = new CopyingObjectWithoutConstructor();
		c1.id = c.id;
		c1.name = c.name;
		c.display();
		c1.display();
	}

}
