package inheritance;

abstract class Fruits{
	abstract public void fruitNmae();
	
	public void name() {
		System.out.println("Enter the details:");
	}
	
}

class Apple extends Fruits{

	@Override
	public void fruitNmae() {
		System.out.println("red colour");
		
	}
	
}

   class Mango extends Fruits{

	@Override
	public void fruitNmae() {
		System.out.println("yellow colour");
		
	}
	
}



public class Abstractionpgm {

	public static void main(String[] args) {
		Apple ob=new Apple();
	    ob.name();
	    ob.fruitNmae();
	    
	    Mango o=new Mango();
	    o.name();
	    o.fruitNmae();

	}

}

