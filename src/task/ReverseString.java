package task;

public class ReverseString {

	public static void main(String[] args) {
     String s="jiya";
     String r="";
      for(int i=0;i<s.length();i++)
      {
    	 r=s.charAt(i)+r;
     }
    System.out.println(r);
	}

}
