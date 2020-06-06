package initialization2;

public class InitializationByMethod {

	public static void main(String[] args) {
		Student s = new Student();
		s.feedData(20, "sumit");
		System.out.println(s.id);
		System.out.println(s.name);

	}

}
