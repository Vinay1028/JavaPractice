package practice;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args){
		String password = "User@123";
		System.out.println("Enter your password :");
		Scanner sc = new Scanner(System.in);
		String guess = sc.nextLine();
		sc.close();
		if(password.equals(guess)){
			System.out.println("Your entered password is correct!");
		}
		else {
			System.out.println("You have Entered wrong password!");
		}
	}
}
