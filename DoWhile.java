package practice;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args)
	{
		String password = "User";
		Scanner sc = new Scanner(System.in);
		String guess;
		do {
			System.out.println("Enter the password : ");
			guess = sc.nextLine();
		}while(!guess.equals(password));
		System.out.println("Congrats! you logged in.");
		sc.close();
	}
}
