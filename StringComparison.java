package practice;

import java.util.Scanner;

public class StringComparison {
public static void main(String[] args)
{
	String password = "Pass@123";
	System.out.println("Enter your password : ");
	Scanner sc = new Scanner(System.in);
	String guess = sc.nextLine();
	sc.close();
	System.out.println(password.equals(guess));
}
}
