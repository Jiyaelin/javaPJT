package constructorprgm;

public class Employee {
	int empid;
	String empname;
	public Employee(int empid,String empname) 
	{
		this.empid=empid;
		this.empname=empname;
	}
	public void display() {
		System.out.println("employee id= "+empid);
		System.out.println("employee name= "+empname);
	}

	public static void main(String[] args) 
	{
		Employee ob=new Employee(101,"jiya");
		ob.display();
		//System.out.println(ob.empid);
		//System.out.println(ob.empname);
		
	

	}

}
