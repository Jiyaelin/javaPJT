package object;

import java.util.Scanner;

public class Pallinsc {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int temp=n;
     	int rev=0;
		int rem;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("pallindrome number");
		}
		else
		{
			System.out.println("not pallindrome number");
		}
		
	
	}

}
