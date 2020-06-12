import java.util.Scanner;

public  class Recursion {
	static int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(fact(number));
		sc.close();
	}

}
