public class SubtringsOfGmail{
	public static void main(String[] args)
	{
		String str = "programmer@gmail.com";
		String firstName = str.substring(0, str.indexOf('@'));
		String domainName = str.substring(str.indexOf('@')+1, str.length());
		System.out.println(firstName);
		System.out.println(domainName);
		int indexOfGmail = str.indexOf("gmail");
		/*String is = str.substring(indexOfGmail, indexOfGmail+5);
		if(is.compareTo("gmail") == 0)
			System.out.println("It is a gmail id");*/
		if(domainName.startsWith("gmail"))
			System.out.println("it is a gmail id");
	}
}