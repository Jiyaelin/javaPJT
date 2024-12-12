package task;

import java.util.Scanner;

public class Hm {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your password: ");
    String p=sc.next();
    String correctpassword="jiya123";
    do {
    	if(correctpassword.equals(p))
    	{
    		System.out.println("suessfully registerd");
    	}
    	}
    	while(!correctpassword.equals(p));{
    	System.out.println("wrong passord");}
   
    }
	}


