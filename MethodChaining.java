package practice;
import java.util.Scanner;
public class MethodChaining {
	public static void main(String[] args) {
		String password = "PassWord";
		System.out.println("Enter your password : ");
		Scanner sc = new Scanner(System.in);
		String guess = sc.nextLine();
		sc.close();
		if(password.toLowerCase().equals(guess.toLowerCase())) {	//the condition inside if is the example of method chaining
			System.out.println("Your password is correct!");
		}
		else {
			System.out.println("password is wrong!");
		}
	}
}
