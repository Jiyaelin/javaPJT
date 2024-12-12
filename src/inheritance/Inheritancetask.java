package inheritance;
class Member{
	String name;
	int age;
	int phonenumber;
	String address;
	int salary;
	public void printDetails() 
	   {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("phnenumber: "+phonenumber);
		System.out.println("address: "+address);
		System.out.println("salary: "+salary);
	}
}
 class Employee extends Member{
	 String department;
	
	   
}
class Manager extends Member{
	String specialisation;
	}
public class Inheritancetask {

	public static void main(String[] args) {
		Employee em=new Employee();
		em.name="jiya";
		em.age=21;
		em.phonenumber=9605171;
		em.address="kochi";
		em.salary=10000;
		System.out.println(em.department="testing");
		em.printDetails();
		
		Manager ma=new Manager();
		ma.name="shinu";
		ma.age=22;
		ma.phonenumber=960517;
		ma.address="pathanamthitta";
		ma.salary=30000;
		System.out.println(ma.specialisation="science");
		ma.printDetails();
	}
}

		
	


