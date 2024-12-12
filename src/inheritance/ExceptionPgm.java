package inheritance;

public class ExceptionPgm {

	public static void main(String[] args) {
		
		try {
		
		int c=5/0;
		System.out.println(c);
		}
		catch(Exception e)//arithmetic exception
		{
			System.out.println(e.getMessage());// we can also enter a string
		}
		System.out.println("hello hi");
		
		
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException a)
		{
			System.out.println("error message");
		}
	
		try { 
	    int[] arr= new int[2];
	    arr[0]=12;
	    arr[2]=13;
	    arr[3]=14;
	    System.out.println(arr[3]);
		}
		catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
	
	}

}
