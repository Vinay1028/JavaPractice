package practice;

public class StringInterning {
public static void main(String[] args)
{
	String s1 = "VinaySingh";
	String s2 = "VinaySingh";
	System.out.println(s1==s2);	//this will return true result because of string interning.This java's internal 
	                             //feature to save the memory . if we store Two same string literals then it will store them at only one place.
	
	String s3 = new String("VinaySingh");
	String s4 = new String("VinaySingh");
	System.out.println(s3==s4);    //it will return false because we are comparing two different objects here
}											
}
