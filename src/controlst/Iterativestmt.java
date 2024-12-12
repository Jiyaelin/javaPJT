package controlst;

public class Iterativestmt {

	public static void main(String[] args) {
		//for loop
		for(int i=1;i<=10;i++)
		{
			System.out.println("value of i="+i);
		}
        //problem
		for(int i=1;i<10;i++)
		{
			System.out.println(i+" x 5= "+i*5);
		}
		
		
		//nested if loop 
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print("*");
			}
	System.out.println();
		}
		
		//problem
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");		
			}
		System.out.println();
		}
		
		//problem
		int number=1;
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		
		//problem
		int fact=1;
					for(int i=1;i<=5;i++) 
					{
						fact=fact*i; // f=1*1=1  1*2=2  2*3=6  6*4=24  24*5=120=-p-
					}
			System.out.println("value of 5!=" +fact);
			
		
	}

}
