package inheritance;

class Birds{
	public void birdsDetails() {
		System.out.println("Birds Details");
	}
}
class Hen extends Birds{
	public void henMthd() {
		System.out.println("Hen Details");
	}
}
class Chicken extends Hen{
	public void chickenMthd()
	{
		System.out.println("Chicken Details");
	}
}
public class Multilevelinheri {

	public static void main(String[] args) {
		Chicken ob=new Chicken();
		ob.birdsDetails();
		ob.henMthd();
		ob.chickenMthd();

	}

}
