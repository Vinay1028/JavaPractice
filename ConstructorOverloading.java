
public class ConstructorOverloading {
	int id;
	String name;
	int age;
	 ConstructorOverloading(int id, String name)
	 {
		 this.id = id;
		 this.name = name;
	 }
	 ConstructorOverloading(int id, String name, int age)
	 {
		 this.id = id;
		 this.name = name;
		 this.age = age;
	 }
	 void display()
	 {
		 System.out.println(id+" "+name+" "+age);
	 }
	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading(23,"shubham");
		ConstructorOverloading c1 = new ConstructorOverloading(25,"sooraj",25);
		c.display();
		c1.display();
	}

}
