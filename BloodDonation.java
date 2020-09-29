import java.util.Scanner;
public class BloodDonation{
	static boolean isEligibleToDonate(int age, int w)
	{
		if(age >= 18)
			if(w>50)
				return true;
			else 
				return false;
		else
			return false;
	}
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();
		if(isEligibleToDonate(age, weight))
			System.out.println("Eligible to donate blood");
		else
			System.out.println("Not Eligible to donate blood");
			
	}
}
