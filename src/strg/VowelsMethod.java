package strg;

import java.util.Scanner;

public class VowelsMethod {

	public static void main(String[] args) {
		// vowel count
		System.out.println("enter the word:");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		VowelsMethod v=new VowelsMethod();
		int count=v.VowelCount(a);
		System.out.println("count of vowels in the word = "+count);
		
		
	
	}
	public int VowelCount(String a) {
		int count=0;
		for(int i=0;i<a.length();i++) {
			if((a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'))
			{
				count++;
			}
		}
		return count;
		}
	}
	
