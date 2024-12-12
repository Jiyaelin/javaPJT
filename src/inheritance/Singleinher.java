package inheritance;

class cars{
	public void displayMthd() 
	{
	System.out.println("cars details");
}
}

class Bmw extends cars{
	public void bmwDetails()
	{
		System.out.println("BMW car details");
	}
}
public class Singleinher {

	public static void main(String[] args) {
		Bmw ob=new Bmw();
		ob.bmwDetails();
		ob.displayMthd();


	}

}
