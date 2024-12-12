package strg;

public class Methodpgrm {

	public static void main(String[] args) {
		// method
		Methodpgrm ob=new Methodpgrm();
		ob.add();
		System.out.println(ob.sub());
		ob.mul(5, 10);
		System.out.println(ob.div(50, 10));

	}
	//method without return type and without parameters add()
	public void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
	//method with return type and without parameters sub()
	public int sub() {
		int a=20,b=10,c;
		c=a-b;
		return c;
	}
	
	//method without return type and with parameters mul()
	public void mul(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	
	//method with return type and with parameters 
	public double div(int a, int b) {
		double d=a/b;
	    return d;
	}

}
