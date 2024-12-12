package testingpack;

public class Prblm1 {

	public static void main(String[] args) {
		int a=23,b=45;
	    String c=(a==b?"a and b are equal":"a and b are not equal");
		System.out.println(c);
		
		int p=55,q=70;
		System.out.println((p<50)&&(p<q)==true);
		
		
		int r=20,s=30;
		System.out.println("value of r before swapping "+r+"\n"+"value of s before swapping "+s);
		r=r+s;//50
		s=r-s;//20
		r=r-s;//30
		System.out.println("value of r after swapping "+r+"\n"+"value of s after swapping "+s);
		
		
		int t=17; 
		System.out.println("the second digit of "+t+ " is " +t%10);
		
		
		

	}

}
