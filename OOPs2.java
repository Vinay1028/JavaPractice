package OOPsPractice;
class Student{
	String name;
	long rollNo;
	String course;
	int sub1, sub2, sub3;
	
	int total()
	{
		return sub1+sub2+sub3;
	}
	
	int average()
	{
		return total()/3;
	}
	
	char grade()
	{
		if(average() >= 60)
			return 'A';
		else 
			return 'B';
	}
	
	public String toString()
	{
		return name+"\n"+rollNo+"\n"+course;
	}
}
public class OOPs2 {
	public static void main(String[] args)
	{
		Student s = new Student();
		s.sub1 = 20;
		s.sub2 = 30;
		s.sub3 = 40;
		s.name = "soorma";
		s.rollNo = 20;
		s.course = "MCA";
		System.out.println(s.total());
		System.out.println(s.average());
		System.out.println(s.grade());
		System.out.println(s);
	}
}
