package inheritance;
interface CarDetails{
	public void acceleration();
	public void speedLimit();
	public void torque();
}
class Benz implements CarDetails{

	@Override
	public void acceleration() {
		System.out.println("Benz Accelaeration");
		
	}

	@Override
	public void speedLimit() {
		System.out.println("Benz Speed Limit");
		
	}

	@Override
	public void torque() {
	System.out.println("Benz Torque");
		
	}
	
	
	
}
public class Interfacepgm {

	public static void main(String[] args) {
		Benz ob=new Benz();
		ob.acceleration();
		ob.speedLimit();
		ob.torque();
		

	}


}