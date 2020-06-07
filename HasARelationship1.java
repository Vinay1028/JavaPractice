class Address{
	String city;
	String state;
	String country;
	Address(String city, String state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Employee{
	int id;
	String name;
	Address address;
	Employee(int id, String name, Address address)
	{
		this.id = id;
		this .name = name;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println(id+ " "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}
public class HasARelationship1 {

	public static void main(String[] args) {
		Address a = new Address("noida","UP","India");
		Address a1 = new Address("gzb","UP","India");
	
		Employee e1 = new Employee(12,"jatin",a);
		Employee e2 = new Employee(20,"sunit",a1);
		
		e1.display();
		e2.display();

	}

}
