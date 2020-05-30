package practice;

public class FindingFirstCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Vinay";
		System.out.println(name.charAt(0)); //finding first character
		
		System.out.println("the length of the string is "+name.length());  //finding length of string
		System.out.println(name.concat(" Singh")); //concatenating the strings
		
		System.out.println(name.contains("nay"));  //checking the a particular string exist or not
		
		System.out.println(name.toUpperCase()); //converting all the letters to uppercase
		System.out.println(name.toLowerCase()); //converting all the characters to lowercase
		
		String removeWhiteSpace = "     vinay singh";
		System.out.println(removeWhiteSpace.substring(7,10)); //finding substring
	}

}
