import java.util.Scanner;
public class PathThroughGraph{
  	
  	public static int gcd(int num1, int num2)
    {
      if(num2 == 0)
        return num1;
      else
        return gcd(num2, num1%num2);
    }
  
  	public static int factors(int number, int commonFactor)
    {
      int counter = 2;
      int factorCounter = 0;
      while(number > commonFactor)
      {
        if(number%counter == 0)
        {
          factorCounter++;
          number /= counter;
        }
        else
        {
          counter++;
        }
      }
      return factorCounter;
    }
  
  	public static int pathThrough(int num1, int num2)
    {
      if(num1 == num2)
      {
        return 0;
      }
      int commonFactor = gcd(num1, num2);
      int shortestPath = 0;
      
      if(commonFactor ==1 )
      {
        shortestPath = factors(num1, commonFactor) + factors(num2, commonFactor);
      }
      else 
      	{
        	if(commonFactor == num1)
      		{
        	shortestPath = factors(num2, commonFactor);
      		}
        	else if(commonFactor == num2)
            {
              shortestPath = factors(num1, commonFactor);
            }
        	else
            {
              shortestPath = factors(num1, commonFactor) + factors(num2, commonFactor);
            }
        }
      return shortestPath;
    }
  	
	public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      scan.close();
      
      int noOfEdges = pathThrough(num1, num2);
      System.out.println(noOfEdges);
    }
}