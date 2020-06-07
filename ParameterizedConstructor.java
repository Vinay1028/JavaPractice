
public class ParameterizedConstructor {
	int id;
	String name;
	 ParameterizedConstructor(int i, String s)
	 {
		 id = i;
		 name = s;
	 }
	 
	 public void display()
	 {
		 System.out.println(id+" "+name);
	 }
	public static void main(String[] args) {
		 ParameterizedConstructor p = new  ParameterizedConstructor(23, "Roshan");
		 ParameterizedConstructor p2 = new  ParameterizedConstructor(30,"sunil");
		 p.display();
		 p2.display();

	}

}
