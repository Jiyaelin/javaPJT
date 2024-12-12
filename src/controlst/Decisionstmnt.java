package controlst;

public class Decisionstmnt {

	public static void main(String[] args) {
		
		// if statement
		int a=10,b=9;
		if(a>b)
		{
		System.out.println("a is greater");
		}
		else// if else statement
		{
			System.out.println("b is greater");
	     }
		
		
		// odd or even
		
        int c=11;
        if(c%2==0)
        {
        System.out.println("c is even")	;
        }
        else
        {
		System.out.println("c is odd");
		}
        
	   // positive or negative
        
        int d=10;
        if(d>0)
        {
        	System.out.println("d is positive");
        }
        else
        {
        	System.out.println("d is negative");
        }
        
        // else if
        
       int e=10,f=20,g=30;
       if(e>f && e>g )
       {
    	   System.out.println("e is greater");
       }
       else if(f>e && f>g)
       {
    	   System.out.println("f is greater");
       }
       else
       {
    	   System.out.println("g is greater");
       }
       
       // nested if else
       int k=55;
       if(k%5==0)
       {
       if(k%11==0)
       {
    	   System.out.println( "k divisible by 5 and 11");
       }
       else
       {
    	   System.out.println("k divisible by 5 not by 11");
       }}
       else
       {
    	   System.out.println( "k is not divisible by 5 and 11");
       }
    	
       //switch
       int z=4;
       switch(z)
       {
       case 1:System.out.println("monday");
       break;
       case 2:System.out.println("tuesday");
       break;
       case 3:System.out.println("wednesday");
       break;
       case 4:System.out.println("thursday");
       break;
       case 5:System.out.println("friday");
       break;
       case 6:System.out.println("saturday");
       break;
       case 7:System.out.println("sunday");
       break;
       default:System.out.println("invalid expression");
       }
       //problm(switch)
       int h=42;
       switch(h)
       {
       case 29:System.out.println("small");
       break;
       case 36:System.out.println("medium");
       break;
       case 42:System.out.println("large");
       break;
       case 44:System.out.println("extra large");
       break;
       default:System.out.println("invalid size");
       }
	}
	
	}


