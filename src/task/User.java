package task;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum = 0;
        char input = 'y';
        do {
        	System.out.println("enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a + b;
            System.out.println(sum);
            System.out.println("Do you wish to continue (y/n)");
            sc.nextLine();
            input = sc.nextLine().charAt(0);
        } while (input == 'y');  
          System.out.println("exit");
          sc.close();
	}

}
