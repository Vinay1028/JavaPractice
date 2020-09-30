public class LabeledForLoop{
	public static void main(String[] args)
	{
		aa:
			for(int i=0; i<=3; i++)
			{
				bb:
					for(int j=0; j<5; j++) {
						if(i==2 && j==2)
							break aa;
				System.out.println(i+ "   "+j);
					}
			}		
	}
}