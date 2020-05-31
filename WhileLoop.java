package practice;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args)
	{
		String password = "User";
		System.out.println("Enter your password :");
		Scanner sc = new Scanner(System.in);
		String guess = sc.nextLine();
		while(!guess.equals(password))
		{
			System.out.println("Enter the password :");
			guess = sc.nextLine();
		}
		System.out.println("congrats you are logged in.");
		sc.close();
	}
}
