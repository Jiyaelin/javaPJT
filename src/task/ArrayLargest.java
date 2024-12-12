package task;



public class ArrayLargest {

	public static void main(String[] args) {
		int[] arr= {10,45,80,60};
		int largest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest) {
			
			largest=arr[i];
		}
}
		System.out.println("largset elements: "+largest);
}}