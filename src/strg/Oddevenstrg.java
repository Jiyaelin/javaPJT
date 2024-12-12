package strg;

import java.util.Scanner;

public class Oddevenstrg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.next();
        String[] words = s.split(" ");
        for (String t : words) 
        {
            if (t.length() % 2 == 0) 
            {
                System.out.println(t+ " is even");
                
            }else
            {
            	System.out.println(t+ " is odd");
            }
        }
	

	}

}
