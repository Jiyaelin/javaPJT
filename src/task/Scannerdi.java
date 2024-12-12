package task;

import java.util.Scanner;

public class Scannerdi {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a<b && b<c) {
		System.out.println("increasing");
	}else if(a>b && b>c) {
		System.out.println("decrease");
	}else 
	{
		System.out.println("neither increasing nor decreasing order");
	}
     sc.close();
	}

}
