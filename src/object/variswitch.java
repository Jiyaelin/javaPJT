package object;

import java.util.Scanner;

public class variswitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:");
		char ch=sc.next().charAt(0);
		System.out.println("enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		case '%':System.out.println(a%b);
		break;
		default:System.out.println("invalid input");
		
		}

	}

}
