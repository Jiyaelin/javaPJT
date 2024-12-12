package strg;

import java.util.Scanner;

public class Areamethod {

	public static void main(String[] args) {
		Areamethod ob=new Areamethod();
		System.out.println("area of square is: "+ob.mul(8, 8));
		System.out.println("area of rectangle is: "+ob.mul(4, 5, 8));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the measurments of triangle:");
		double a=sc.nextDouble();
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("area of triangle is: "+ob.mul(a, b, h));
		
		System.out.println("enter the measurements of circle:");
		double p=sc.nextDouble();
		int r=sc.nextInt();
		System.out.println("area of circle is: "+ob.mul(p, r));
	}
	//square
	public int mul(int a,int b) {
		int c=a*b;
		return c;
	}
	
	//rectangle
	public int mul(int l,int b,int h) {
		int c=l*b*h;
		return c;
	}
	
	//triangle
	public double mul(double a,int b,int h) {
		double c=a*b*h;
		return c;
	}
	
	//circle
	public double mul(double p,int r) {
		double k=p*r*r;
		return k;
	}
}
