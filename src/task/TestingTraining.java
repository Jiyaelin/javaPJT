package task;

import java.util.Scanner;

public class TestingTraining {

	public static void main(String[] args) {
	System.out.println("enter the text");	 
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] words=s.split(" ");
    String r="";
    for(int i=words.length-1;i>=0;i--) {
    	r+=words[i]+" ";
    }
    System.out.println(r.trim());
    sc.close();
	
	

	}
}
	
