package jumpingstmnt;

import inheritance.Protectc;

public class Breakcontinuestmnt extends Protectc  {

	public static void main(String[] args) {
		//Access Modifiers
		Breakcontinuestmnt obj=new Breakcontinuestmnt();//protected
		System.out.println(obj.c=100);//protected
		System.out.println(obj.a=200);
		
		//break statement
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
}
			
