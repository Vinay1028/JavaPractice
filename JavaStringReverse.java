import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        StringBuilder str = new StringBuilder();
        str.append(A);
        str = str.reverse();
        String s = str.toString();
        if(A.compareTo(s) == 0)
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}