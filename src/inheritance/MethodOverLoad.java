package inheritance;

public class MethodOverLoad {

	public static void main(String[] args) {
		MethodOverLoad ob=new MethodOverLoad();
		ob.add();
		ob.add(10, 10);
		ob.add(20, 10.5);
		ob.add(4.5, 5);

	}
	public void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b){
		double c=a+b;
		System.out.println(c);
		}
	public void add(double a,int b) {
		double c=a+b;
		System.out.println(c);
		}
	

}
