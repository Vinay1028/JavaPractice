
public class GetterAndSetter {
	public static void main(String[] args)
	{
		User user = new User();
		user.setFirstName("vinay");
		user.setLastName("singh");
		//System.out.println(user.getFirstName()+" "+user.getLastName());
		User.printUser(user);
	}
}
