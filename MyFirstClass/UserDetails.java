package MyFirstClass;

public class UserDetails {

	public static void main(String[] args) {
		User user = new User();
		user.firstName = "Vinay"; //setting properties of user
		user.lastName = "Singh";
		System.out.println(user.getFullName()); //printing user full name to the console
	}

}
