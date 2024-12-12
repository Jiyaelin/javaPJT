package strg;

import java.util.Scanner;

public class strgpallin {

	public static void main(String[] args){
		//string pallindrome
		
		System.out.println("enter a string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("entered string is pallindrome");
		}
			else
			{
				System.out.println("entered string is not pallindrome");
		}
		
		

	}

}
