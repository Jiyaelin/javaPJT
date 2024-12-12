package task;

public class ArrayOddEven {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=2;
		arr[1]=4;
		arr[2]=6;
		arr[3]=7;
		arr[4]=9;
		 
			System.out.println("Odd Numbers:");
	        for (int num : arr) 
	        {
	            if (num % 2 != 0)
	            {
	                System.out.print(num + " ");
	            }
	        }
	        
	        System.out.println();
	        System.out.println("Even Numbers:");
	        for (int num : arr) 
	        {
	            if (num % 2 == 0) 
	            {
	                System.out.print(num + " ");
	            }
	        }

	}

}
