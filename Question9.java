import java.util.Scanner;
public class Question9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		if(num1 == num2)
			System.out.println(num1+" == "+num2);
		if(num1 != num2)
			System.out.println(num1+" != "+num2);
		if(num1>num2)
			System.out.println(num1+" > "+num2);
		if(num1<num2)
			System.out.println(num1+" < "+num2);
		if(num1>=num2)
			System.out.println(num1+" >= "+num2);
		if(num1<=num2)
			System.out.println(num1+" <= "+num2);
	}
}