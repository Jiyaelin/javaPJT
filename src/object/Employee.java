package object;

public class Employee {
	
	int empid;
	String empname;
	String empdesgn;

	public static void main(String[] args) {
		// object creation
		
		Employee emp1=new Employee();
	    System.out.println(emp1.empid=101);
	    System.out.println(emp1.empname="jiya");
		System.out.println(emp1.empdesgn="tester");
	
		Employee emp2=new Employee();
		emp2.empid=102;
		emp2.empname="shinu";
		System.out.println(emp2.empid);
		

	}

}
