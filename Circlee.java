package OOPsPractice;

public class Circlee {
	double radius ;
	 Circlee(int a)
	{
		 System.out.println("circle");
		radius = 0.0;
	}
	
	 
	double area()
	{
		return Math.PI * radius * radius;
	}
	
	double  perimeter()
	{
		return 2* Math.PI *radius;
	}

}
