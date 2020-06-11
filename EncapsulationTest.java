class Employee{
	private int id;
	private String name;
	private int age;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class EncapsulationTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(55);
		e.setName("Abdul");
		e.setAge(45);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAge());
	}

}
