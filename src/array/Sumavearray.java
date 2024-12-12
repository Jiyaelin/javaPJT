package array;

import java.util.Scanner;

public class Sumavearray {

	public static void main(String[] args) {
		int[] a=new int[3];
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		int sum=0;
		int avg;
		for(int i=0;i<=2;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/2;
		System.out.println("sum= "+sum);
		System.out.println("avg= "+avg);
		

	}

}
