
public class MethodOverloading {
	
	public static int max(int a, int b)
	{
		int max=0;
		if(a>b)
			max=a;
		else
			max=b;
		return max;
	}
	
	public static double max(double a, double  b)
	{
		double max=0;
		if(a>b)
			max=a;
		else
			max=b;
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Max Is : "+max(9,10));
		System.out.println("The Max Is : "+max(33.3,55.6));
	}

}
