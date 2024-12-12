package array;

import java.util.Scanner;

public class Userpass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("enter the username and password:");
		String[][] arr=new String[r][c]; 
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.next();		
				}
		}
		
        System.out.println("the username and password: ");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		System.out.print(arr[i][j]+ " ");
        	}
        	System.out.println();
        }
	}

}
