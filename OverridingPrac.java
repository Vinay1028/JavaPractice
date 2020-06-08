class Bank{
	float getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank{
	float getRateOfInterest()
	{
		return 8;
	}
}
class HDFC extends Bank{
	float getRateOfInterest() {
		return 6;
	}
}

class PNB extends Bank{
	float getRateOfInterest() {
		return 9;
	}
}
public class OverridingPrac {

	public static void main(String[] args) {
		SBI s = new SBI();
		HDFC h = new HDFC();
		PNB p = new PNB();
	float iSBI = s.getRateOfInterest();
	float iHDFC = h.getRateOfInterest();
	float iPNB = p.getRateOfInterest();
	System.out.println("Rate of interest of SBI is : "+iSBI);
	System.out.println("Rate of interest of HDFC IS : "+iHDFC);
	System.out.println("Rate of interest of PNB is : "+iPNB);

	}

}
