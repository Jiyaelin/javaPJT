package task;

import java.util.Scanner;

public class CountStringpg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a text: ");
		String t=sc.next();
		int count=t.length();
		System.out.println("the total number of characters: "+count);

	}

}
