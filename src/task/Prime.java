package task;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("enter a positive number");
		Scanner sc=new Scanner(System.in);
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
			System.out.println(temp+ " is a prime number");
		}
		else
		{
			System.out.println(temp+ "not prime number");
		}
		

	}

}
