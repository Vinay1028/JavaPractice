package OOPsPractice;

public class Subject {
	String subId;
	String name;
	int maxMarks;
	int marksObtain;
	
	Subject(String subId)
	{
		this.subId = subId;
	}
	
	Subject(String sub, String n)
	{
		subId = sub;
		name = n;
	}
	
	Subject(String sub, String n, int maxMarks, int marksObtain)
	{
		subId = sub;
		name = n;
		this.maxMarks = maxMarks;
		this.marksObtain = marksObtain;
	}
	
	public String getSubId()
	{
		return subId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setMaxMarks(int max)
	{
		maxMarks = max;
	}
	
	public int getMaxMarks()
	{
		return maxMarks;
	}
	
	public void setMarksObtain(int obt)
	{
		marksObtain = obt;
	}
	
	public int getMarksObtain()
	{
		return marksObtain;
	}
	
	public String toString()
	{
		return subId+"\n"+name+"\n"+maxMarks+"\n"+marksObtain;
	}
}
