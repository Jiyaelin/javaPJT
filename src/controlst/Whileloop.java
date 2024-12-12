package controlst;

public class Whileloop {

	public static void main(String[] args) {
			
	int i=1;
	while(i<=10)
	{
		System.out.println(i);
		i++;
	}

//reverse a number
	int num=256,reversed=0;
	while(num!=0)
	{
		int d=num%10;//256%10=6;25%10=5;2
		reversed=reversed*10+d;//0*10+6=6;6*10+5=65;65*10+2 652
		num /=10;//256/10=25;25/10=2
	}
	System.out.println("the reverse of the given num is: "+reversed);
	
	//problem
	int n=5876,count=0;
	while(n!=0)
	{
		n=n/10;//5876/10=587  587/10=58  58/10=5  5/10=0
		count++;
	}
	System.out.println("number of digits = "+count);	
	}

}
