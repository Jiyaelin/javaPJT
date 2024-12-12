package testingpack;

public class Operator {

	public static void main(String[] args) {
		
		// Arithmetic operators
		int a=10,b=30;
		
		System.out.println("value of a+b="+(a+b));
		System.out.println("value of a-b="+(a-b));
		System.out.println("value of a*b="+(a*b));
		System.out.println("value of a/b="+(a/b)); // quotient
		System.out.println("value of a%b="+(a%b)); // reminder
		
		// Assignment operator
		int c=a;//10
		System.out.println((a+=b));	//a=a+b 10+30=40	
		System.out.println((a-=b)); //a=a-b 40-30=10
		System.out.println((c=a));//10
		
		//Relational operator
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		
		// Logical operator
		// A   B   A&&B   A||B   !A   !B
		// 0   0    0      0      1    1
		// 1   0    0      1      0    1
		// 0   1    0      1      1    0
		// 1   1    1      1      0    0
		String username="jiya";
		String password="jiya123";
		System.out.println((username=="jiya")&&(password=="jiya123"));
		System.out.println((username=="abc")&&(password=="jiya123"));
		System.out.println((username=="jiya")||(password=="jiya123"));
		System.out.println((username=="abcd")||(password=="jiya123"));
		System.out.println(!(username=="jiya"));
		System.out.println(!(username=="abc"));
		
		// Unary operator
		   int c1=10;
		// c1++ post-increment
		// ++c1 pre-increment
		System.out.println(c1++);//10
		System.out.println(c1);//11
		System.out.println(++c1);//12
		
		System.out.println(c1--);//12
		System.out.println(c1);	//11	
		System.out.println(--c1);//10
	
		// Ternary operator
		// syntax:
		//        variable=condition?exp1:exp2
		int c2=20;
		String v=c2>c1?"c2 is larger":"c1 is larger";
		System.out.println(v);
		
		

	}

}
