
public class InstanceBlock {
	InstanceBlock(){
		System.out.println("Constructor is invoked");
	}
	
	{
		System.out.println("This is the instance block");
	}

	public static void main(String[] args) {
		InstanceBlock i = new InstanceBlock();

	}

}
