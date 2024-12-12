package task;

import java.util.Scanner;

public class PositivenegativeSc {

	public static void main(String[] args) {
		int z=0,p=0,n=0;
		System.out.println("Enter the length of values: ");
		Scanner sc=new Scanner(System.in);
		int nl=sc.nextInt();
		System.out.println("enter value: ");
		for(int i=0;i<nl;i++)
		{
			int c=sc.nextInt();
			if(c==0)
				z++;
			else if(c>0)
				p++;
			else 
				n++;
		}
		System.out.println("Count of zero values: "+z);
		System.out.println("counr of positive integers: "+p);
		System.out.println("count of negative integers: "+n);
		

	}

}
