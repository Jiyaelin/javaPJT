package strg;

public class Stringpgrm {

	public static void main(String[] args) {
		// string class
		
		//concate
		String s="Hello";
		String s1="welcome to luminar";
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		System.out.println(2+3+s+5+6);
		
		//equals and equalIgnoreCase
		String  s2="hello";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equals(s2));
		
		//toUpper and toLOwer
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		//length
		System.out.println(s1.length());
		
		//startsWith and endsWith
		System.out.println(s1.startsWith("welcome to luminar"));
		System.out.println(s1.endsWith("luminar"));
		
		//contains
		System.out.println(s1.contains("to"));
	
		//replace
		System.out.println(s.replace('e', 'a'));
		System.out.println(s1.replace('m', 'i'));
		System.out.println(s1.replace("to", "jiya"));
		
		//CharAt
		System.out.println(s.charAt(3));
		
		//subString
		System.out.println(s.substring(1,4));
		System.out.println(s1.substring(5));
		
		//trim
		String s3="  jiya ";
		String s4=s+s3;
		System.out.println(s4);
		String s5=s3.trim();
		System.out.println(s+s5);
		
		
		//split
		String s7="hello luminar technolab";
		String[] st=s7.split(" ");
		for(String e:st)
		{
		
		System.out.println(e);

		}
		
		
		//toCharArray
		String s8="HELLO";
		char[] c=s8.toCharArray();
		for(char el:c)
		{
			System.out.println(el);
		}
		
		
		}

}
