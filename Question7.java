import java.util.Scanner;
public class Question7{
	int num1;
	int num2;
	static void swap(Question7 q)
	{
		int temp = 0;
		temp = q.num1;
		q.num1 = q.num2;
		q.num2 = temp;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Question7 q = new Question7();
		q.num1 = sc.nextInt();
		q.num2 = sc.nextInt();
		sc.close();
		System.out.println("Before Swap : "+q.num1+" "+q.num2);
		swap(q);
		System.out.println("After Swap :"+q.num1+" "+q.num2);
	}
}
