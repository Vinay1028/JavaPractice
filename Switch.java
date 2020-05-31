package practice;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		System.out.println("What is the day today :");
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		sc.close();
		switch(day) {
		case "monday":
				System.out.println("1st day of the week");
				break;
		case "tuesday":
			System.out.println("2nd day of the week");
			break;
		case "wednesday":
			System.out.println("3rd day of the week");
			break;
		case "thursday":
			System.out.println("4th day of the week");
			break;
		case "friday":
			System.out.println("5th day of the week");
			break;
		case "saturday":
			System.out.println("6th day of the week");
			break;
		case "sunday":
			System.out.println("7th day of the week");
			break;
		default:
			System.out.println("entered invalid day!");
		}
	}
}
