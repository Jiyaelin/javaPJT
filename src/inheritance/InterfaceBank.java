package inheritance;

import java.util.Scanner;

interface BankM{
	public void accountDetails();
	 void balance();
	 void withDraw();
	 void deposit();
	
}

class Sbi implements BankM{
   int balance=10000;
   static String bankname="sbi";
   int withdraw;
   int deposit;
   int accountNo;
   Scanner sc=new Scanner(System.in);
   
	@Override
	public void accountDetails() {
		System.out.println("enter yout account number: ");
		accountNo=sc.nextInt();
		System.out.println("your account details: "+"\n"+accountNo+"\n"+bankname);
		
	}

	@Override
	public void balance() {
		System.out.println("your current balanceis: "+balance);
	}

	@Override
	public void withDraw() {
		System.out.println("enter amount for withdrawl:");
		withdraw=sc.nextInt();
		balance=balance-withdraw;
		System.out.println("your final balance is: "+balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("enter deposit amount : ");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("your final balance is: "+balance);
	}
      

	
	
}



public class InterfaceBank {

	public static void main(String[] args) {
		Sbi ob=new Sbi();
		ob.accountDetails();
		ob.balance();
		ob.withDraw();
		ob.deposit();

	}

}
