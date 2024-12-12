package array;

import java.util.Scanner;

public class Scarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int[] a=new int[3];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		for(int i=0;i<=2;i++)
		{
			System.out.println(a[i]);
		}

	}

}
