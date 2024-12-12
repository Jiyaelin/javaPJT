package inheritance;
public class Privatec {
	private int a;
	int b;//default
	
	
	

	public static void main(String[] args) {
		Privatec ob=new Privatec();
		System.out.println(ob.a=10);
		System.out.println(ob.b=20);
		Protectc obj=new Protectc();//protected
		System.out.println(obj.c=100);//protected
		
	}

}
