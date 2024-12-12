package inheritance;
class Animal{
	public void animalMthd() {
		System.out.println("Animal Details");
	}
}
class Lion extends Animal {
	public void Liondetails() {
		System.out.println("Lion Details");
	}
}
class Tiger extends Animal{
	public void Tigerdetails()
	{
		System.out.println("Tiger Details");
	}
}
public class Hierarchialinheri {

	public static void main(String[] args) {
		Lion l1=new Lion();
		l1.animalMthd();
		l1.Liondetails();
		Tiger t1=new Tiger();
		t1.animalMthd();
		t1.Tigerdetails();
		

	}

}
